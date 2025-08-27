package CYCLICSORT;

public class FirstMissingNumber {
    public static void main(String[] args){
        int[] arr = {3,4,-1,1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            //ignoring all the elements greater than N and
            //ignoring all the -ve elements.
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                //the missing positive no. we are checking from index 0 to N
                //means we should have to return  index + 1;
                return index + 1;
            }
        }
        //case 2
        return arr.length + 1;
    }
    static void swap(int[] arr,int start,int k){
        int temp = arr[start];
        arr[start] = arr[k];
        arr[k] = temp;
    }
}
