import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {-31,0,-4,59,33};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped = false; //initialize before inner loop
        //run the steps n-1 times;
        for(int i=0; i<arr.length - 1; i++){
            //for each step, max item will come at the last respective index.
            for(int j=1; j<arr.length - i; j++){
                swapped = false;
                //swap if the item is smaller that the previous item
                if(arr[j] < arr[j - 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =  temp;
                    swapped = true;
                }
            }
            //if you did not sort for the particular value of i, it means the array is sorted hence stop the program.
            if(!swapped){ //if not false the it will give true.
                break;
            }
        }
    }
}
