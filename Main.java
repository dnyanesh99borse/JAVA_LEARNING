
// import java.util.*;
// import java.util.Arrays;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of Array: ");
//         int size = sc.nextInt();
//         int array[] = new int[size];
//         boolean isAscending = true;
//         for (int i = 0; i<array.length; i++){
//             System.out.print("Enter the Element of Array: ");
//             array[i] = sc.nextInt();
//         }
//         System.out.print("The Array is: "  + Arrays.toString(array));

//         for(int i = 0; i < array.length - 1; i++){
//             //here array.length is for terminatio conditon that is exception handling
//             if(array[i] > array[i + 1]){
//                 isAscending = false;
//             }
//         }

//         if(isAscending){
//             System.out.println("\nThe array is in ascending order");
//         }else{
//             System.out.println("\nThe array is not sorted in ascending order: ");
//         }
//     }
// }


//=========================2D ARRAYS======================================


import java.util.*;
public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows of Array: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of cols of Array: ");
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            System.out.print("Enter the Element [" + i + "][" + j + "] of Array: ");
            numbers[i][j] = sc.nextInt();
        }
    }

    System.out.println("\nArray is:");
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            System.out.print( numbers[i][j] + " ");
        }
        System.out.println();
    }
  }
}