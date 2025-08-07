public class RotationCountInRotSort {
    public static void main(String[] args){
        //it is a array rotated clockwise..
        //if the array rotates anticlockwise then minus the
        // count from the last element to get a actual final count.
        int[] arr = {15,18,2,3,6,12};
        int ans = RotationCount(arr);
//        System.out.println("pivot is: "+ans);
        System.out.println("Total count are: "+ans);
    }

    static int RotationCount(int[] arr){
        int pivot = findPivot(arr);
        int count = 1;
        int start = 0;
        while(start < pivot){
            count++;
            start++;
        }
//        int result = arr.length - 1
        return count;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            //that four cases here
            //to avoid the out ofIndex exception.
            if(mid<end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
