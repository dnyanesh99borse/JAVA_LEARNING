package CYCLICSORT;

import java.util.Arrays;

public class MisMatched {
    public static void main(String[] args){
        int[] arr = {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        int[] ansarr = new int[2];
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                ansarr[0] = arr[index];     // duplicate
                ansarr[1] = index + 1;      // missing
                break;
            }
        }
        return ansarr;
    }

    static void swap(int[] arr, int start, int k){
        int temp = arr[start];
        arr[start] = arr[k];
        arr[k] = temp;
    }
}
