package CYCLICSORT;

public class RepeatativeElement {
    public static void main(String[] args){
        int[] arr = {1,3,4,2,2};
        int ans = Repeatative(arr);
        System.out.println(ans);
    }

    static int Repeatative(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        //find repeatative number;
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return arr[index];
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
