public class CeilingNumber {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20;
        int ans = findCeilingNumber(arr,target);
        System.out.println(ans);
    }

    //return the index of the smallest no >= target
    static int findCeilingNumber(int[] arr, int target){

        //case: but what if the target is greater than the greatest number in the array
        //i.e: the number is not present in the array;
        if(target >= arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
