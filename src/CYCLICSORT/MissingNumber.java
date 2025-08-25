
//AMAZON QUESTION
package CYCLICSORT;
import java.util.*;
public class MissingNumber{
    public static void main(String[] args){
        int[] arr= {4,0,2,1};
        int missing = Missing(arr);
        System.out.println(missing);
    }
    public static int Missing(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            //here this arr[i]<arr.length con. should necessary for avoiding out of bound index of array.
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,arr[i]);
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

        //case 2
        return arr.length;
    }
    static void swap(int[] arr,int start,int k){
        int temp = arr[start];
        arr[start] = arr[k];
        arr[k] = temp;
    }
}
