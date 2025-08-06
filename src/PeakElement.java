public class PeakElement {
    public static void main(String[] args){
        int[] arr = {0, 2, 4, 7, 5, 3, 1};
        int ans = findPeakElement(arr);
        System.out.println("Peak element is:  "+ans);
    }

    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            // We are in the decreasing part
            // Peak could be mid or before
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                // We are in the increasing part
                // Peak is after mid
                start = mid + 1;
            }
        }
        // start == end is the peak index
        return start;
    }
}
