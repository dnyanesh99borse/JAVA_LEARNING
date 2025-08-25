package CYCLICSORT;

public class DisappearedNumber {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        int disappear = Disappear(arr);
        System.out.println(disappear);
    }

    public static int Disappear(int[] arr){
        int i = 0;
        while(i < arr.length - 1){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int start,int k){
        int temp = arr[start];
        arr[start] = arr[k];
        arr[k] = temp;
    }
}
