
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


// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number of rows of Array: ");
//     int rows = sc.nextInt();
//     System.out.print("Enter the number of cols of Array: ");
//     int cols = sc.nextInt();

//     int[][] numbers = new int[rows][cols];
//     for(int i = 0; i < rows; i++){
//         for(int j = 0; j < cols; j++){
//             System.out.print("Enter the Element [" + i + "][" + j + "] of Array: ");
//             numbers[i][j] = sc.nextInt();
//         }
//     }

//     System.out.println("\nArray is:");
//     for(int i = 0; i < rows; i++){
//         for(int j = 0; j < cols; j++){
//             System.out.print( numbers[i][j] + " ");
//         }
//         System.out.println();
//     }
//   }
// }



// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number of rows of Array: ");
//     int rows = sc.nextInt();
//     System.out.print("Enter the number of cols of Array: ");
//     int cols = sc.nextInt();

//     int[][] numbers = new int[rows][cols];
//     for(int i = 0; i < rows; i++){
//         for(int j = 0; j < cols; j++){
//             System.out.print("Enter the Element [" + i + "][" + j + "] of Array: ");
//             numbers[i][j] = sc.nextInt();
//         }
//     }

//     System.out.print("Enter the number to find: ");
//     int x = sc.nextInt();
//     System.out.println("\nArray is:");
//     for(int i = 0; i < rows; i++){
//         for(int j = 0; j < cols; j++){
//             System.out.print( numbers[i][j] + " ");
//             if(numbers[i][j] == x){
//                 System.out.println("\nElement " + x + " is found at position [" + i +
//                 "][" + j + "]");
//             }
//         }
//         System.out.println();
//     }
//   }
// }


//===========================STRINGS======================================//
// public class Main{
//     public static void main(String args[]){
//         String name = "Dnyaneshwar";
//         String Fullname = "Dnyaneshwar Sambhaji Borse";
//         String sentence = "Hi am a Successfull Independent Billionaire";

//         System.out.println(name +Fullname + sentence);
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();  // Use nextLine() to capture full name including spaces

//         System.out.print("Enter your Bio: ");
//         String bio = sc.nextLine();  // Use nextLine() to capture full bio including spaces

//         System.out.println("The name of the user is: " + name);
//         System.out.println("The Bio of the user is: " + bio);
//     }
// }

//DIFFERENT FUNCTIONS AND METHODS ON STRING:

//1).compareTo() = to compare two different strings.
// public class Main{
//     public static void main(String[] args) {
//         String name1 = "Dnyanesh";
//         String name2 = "Elon";

        
//         if(name1.compareTo(name2) == 0){
//             System.out.println(name1 + " equal to " + name2);
//         }else if(name1.compareTo(name2) < 0){
//             System.out.println(name1 + " is less than " + name2);
//         }else if(name1.compareTo(name2) > 0){
//             System.out.println(name1 + " is greater than " + name2);
//         }
//     }
// }


//-------------------------EXCEPTION HANDLING---------------------------
/*
 * TYPES OF ERRORS:
 * 1.Syntax error(compile error)
 * 2.Runtime error
 * 3.Logical error
 * 
 * "Exception handling is a way to handle the runtime errors so that the normal flow of the application can be maintained."
 *  "It is a object which throwns on a runtime at runtime.  "
 */

 //TRY AND CATCH FOR EXCEPTION HANDLING.
 //Using this method we provides the code which can give excetion in try function 
 //we writes the action or the activity that will perform if that exception will occur 
 //inside the CATCH section.
/* 
 public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
            int c = a / b; // This will cause a division by zero error
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) { // Catch specific exception
            System.out.println("Error: Division by zero is not allowed.");
            System.exit(-1); // Indicating error
        }
    }
}
*/

// catch (ArithmeticException e): in this line of code the e is system generated object for 
//ArithmeticException class which is used to handle the exception.

//like : Student stu = new Student();
//System.out.println(stu); it will print the info about that object of the student class. 

// public class Main{
//     public static void main(String[] args) {
//         int[] numerators = {10,200,30,40};
//         int[] denominators = {1,2,0,4};
//         for(int i = 0; i < denominators.length; i++){
//             System.out.println(divide(numerators[i],denominators[i]));
//     }
//     System.out.println("Good job: ");
// }

// public static int divide(int a,int b) {
//     try {
//         return a / b;
//     }catch (ArithmeticException e){
//         System.out.println("Error: Division by zero is not allowed.");
//         return -1;
//     }
// }
// }

//here first two steps will executer fluently and then at the iteration three 
//where the no. is dividing by 0 and thus the error or exception will arise and thus
//there by handling the errror the message will print and then after the remaining iterations 
//will also execute the remaing steps... in try and cathch..

//WE CAN ALSO USE A MULTIPLE CATCH FOR VARIOUS EXCEPTIONS...
//but there HEIRACHICAL ORDER IS IMPORTANT..


// public class Main {
//     public static void main(String[] args) {
//         int[] numerators = {10, 200, 30, 40};
//         int[] denominators = {1, 2, 0, 4};

//         for (int i = 0; i < denominators.length; i++) {
//             System.out.println("Result: " + divide(numerators[i], denominators[i]));
//         }
        
//         System.out.println("Good job!");
//     }

//     public static int divide(int a, int b) {
//         try {
//             return a / b;
//         } catch (ArithmeticException e) {
//             System.out.println("This is ArithmeticException: Division by zero.");
//             return -1;
//         } catch (Exception e) {
//             System.out.println("This is a general Exception.");
//             return -2;  // Add a return statement to satisfy Java's requirements
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 0;
//         try {
//             int c = a / b;
//             System.out.println("Result: "+ c);
//         } catch (ArithmeticException e) {
//             System.out.println("Oops! You can't divide by zero.");
//         }
//         System.out.println("Program continues...");
//     }
// }

//==========TRY-CATCH-FINALLY===============
//The finally block is always executed,
// no matter what — even if an exception is not thrown or even if you return from the method.

// public class Main{
//     public static void main(String[] args){
//     try{
//         int[] nums = {1,2,3};
//         System.out.println(nums[5]);
//     }catch (ArrayIndexOutOfBoundsException e){
//         System.out.println("Invalid Index used");
//     }finally{
//         System.out.println("This will always run.");
//     }
//   }
// }

//=============MULTIPLE CATCH BLOCKS=================
//You can handle different types of exceptions differently:
// public class Main{
//     public static void main(String[] args) {
//         try {
//             String s = null;
//             System.out.println(s.length());
//         } catch (NullPointerException e) {
//             System.out.println("Null reference..!");
//         }catch (Exception e){
//             System.out.println("This is a general Exception.");
//         }
//     }
// }


//=================Catching All Exceptions (Not Recommended Always)================
// public class Main{
//     public static void main(String[] args) {
//         try {
//             int num = Integer.parseInt("abc");
//         } catch (Exception e) {
//             System.out.println("Something went wrong:"+e.getMessage());
//         }
//     }
// }


//====================CUSTOM EXCEPTION============================

// class MyException extends Exception{
//             public MyException(String message){
//                 super(message);
//             }
// }

// public class Main{
//     public static void main(String[] args){
//         try{
//             throw new MyException("this is custom error");
//         }catch(MyException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }
    

//------example:2-----
// class AgeToSmallException extends Exception{
//     public AgeToSmallException(String message){
//         super(message);
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int age = 15;
//         try {
//             if(age<18){
//                 throw new AgeToSmallException("you must be 18+ to register.");
//             }
//         } catch (AgeToSmallException e) {
//             System.out.println("Registration Failed: "+e.getMessage());
//         }
//     }
// }


//=======================THROWS IN JAVA========================
//The throws keyword is used in method declarations to indicate that the method might throw an exception.

// It's like telling Java:
// Hey, this method might cause an exception, 
// so the caller should be prepared to handle it


// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         try {
//             readFile();
//         } catch (FileNotFoundException e) {
//             System.out.println(" File not found: " + e.getMessage());
//         }
//     }

//     public static void readFile() throws FileNotFoundException{
//         File file = new File("data.txt");
//         Scanner scanner = new Scanner(file);
//         while(scanner.hasNextLine()){
//             System.out.println(scanner.nextLine());
//         }
//     }
// }



/*===========================================================DATA STRUCTURES AND ALGORITHM USING JAVA==================================================== */

//--------------------------------ARRAYS----------------------------//
//1)
// public class Main {
//     public static void main(String[] args) {
//         int[] marks = {19, 35, 25, 73, 64, 59};

//         for (int i = 0; i < marks.length; i++) {
//             if (marks[i] < 35) {
//                 System.out.println("the roll number is: "+i);
//             }
//         }
//     }
// }

//2)
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {32,43,54,23};
//         int sum = 0;
//         for(int i = 0;i<arr.length;i++){
//             sum += arr[i];
//         }
//         System.out.println("Sum of the elements of the array is: "+sum);
//     }
// }

//3)
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Size of the Array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter the Elements of the Array: ");
//         for(int i = 0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+",");
//         }
//         System.out.println("");

//         System.out.println("Enter the x to find: ");
//         int x = sc.nextInt();
//         for(int i = 0; i< arr.length;i++){
//             if(arr[i] == x){
//                 System.out.println("Element x is on index: "+i);
//                 break;
//             }
//         }
//     }
// }

//4)
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {34,5,24,77,55};
//         int max = -1;
//         int secmax = -1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] > max){
//                 max = arr[i];
//         }
//          for(int j=0;j<i;j++){
//                     if(arr[i]<max) secmax = arr[i];
//                 }
        
//             }
//         System.out.println("The max element in the array is: "+max);
//         System.out.println("The second-max element in the array is: "+secmax);
//     }
// }


//5)
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {34, 35, 22, 66, 45, 33};
//         int x = 22;
//         int sum = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] > x) sum += arr[i];
//         }
//         System.out.println("Sum of the elements greater than x are: "+sum);
//     }
// }


//6) LEETCODE: TWO SUM QUESTION.
class Solution{
    public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        int[] ans = new int[2];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j && nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
public class Main{
    public static void main(String[] args){
        int[] array = {2,7,11,15};
        int find = 18;
        Solution s = new Solution();
        s.twoSum(array, find);
        int[] result = s.twoSum(array, find);  // Fix: capture result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

