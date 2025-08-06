public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = findTarget(arr,target);
        System.out.println("Index of the target element is: "+ans);
    }

//function to finding the target element finally
    static int findTarget(int[] arr, int target){
        int peak = findPeakIndex(arr);
        int firstTry = AgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
      //try to search in second half
        return AgnosticBS(arr,target,peak + 1,arr.length - 1);
    }

    //function to find the peak element
    static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    //function to search target in both 1st & 2nd half that is in ascending and descending part.
    static int AgnosticBS(int[] arr, int target,int start,int end){
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
