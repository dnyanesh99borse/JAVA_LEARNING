package CYCLICSORT;

import java.util.*;
public class CyclicSort {
    public static void main(String[] args){
        //int[] arr = {3,5,2,4}; now for this array it will not work.
        //cause there is not 1 present and as per our logic the code will not work.
        //and hence always remember "CYCLIC" sorting will work only for 1 to N elements.
//        int[] arr = {3,5,2,1,4};
        int[] arr = {9,6,4,2,3,5,7,1,8};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            //means the number on the index i should be equal to the i+1;
            //eg: i=0; element should i
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int start,int k){
        int temp = arr[start];
        arr[start] = arr[k];
        arr[k] = temp;
    }
}
