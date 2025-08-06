public class AgnosticBs {
    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int target = 0;
        int ans = AgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int AgnosticBS(int[] arr, int target){
       int start = 0;
       int end = arr.length - 1;
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
