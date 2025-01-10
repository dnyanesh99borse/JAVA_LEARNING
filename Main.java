// public class Main {
//     public static void main(String[] args){
//         System.out.println("Hello world with java");
//         System.out.println("Hey i am a Billionaire");
//         System.out.print("Hello world with java \n I am a soul of success");
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("#\n##\n###\n####");
//  }
// }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         System.out.println(name);
//    }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String line = sc.nextLine();
//         System.out.println(line);
//    }
// }
//-------TAKE VARIABLES AS A AND B AND PRINT THE SUM----------
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = (a+b);
//         System.out.println("sum of " +a+ " + " +b+ " is "+ sum);
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age = sc.nextInt();
//         if(age > 18){
//             System.out.println("you are Adult");
//         }
//         else{
//             System.out.println("you are not Adult");
//         }
//     }
// }
//Q] TAKE A NUMBER AS INPUT FROM USER AND CHECK WHETHER IT IS EVEN OR ODD;
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num = sc.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("It is Even number");
//         } else {
//             System.out.println("It is Odd number");
//         }
//     }
// }
//TAKE TWO NUMBERS FROM USER AS INPUT AND SAY WHETEHER IT IS EQUAL, GREATER, OR LESSER
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int a = sc.nextInt();
//         System.out.println("Enter Second number:");
//         int b = sc.nextInt();
//         if(a == b){
//             System.out.println(a + " is Equal to " + b);
//         }else if(a>b){
//             System.out.println(a + " is Greater than " + b);
//         }else {
//             System.out.println(a + " is lesser than " + b);
//         }
//     }
// }
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number on button");
//         int button = sc.nextInt();
//         if (button == 1) {
//             System.out.println("Hello");
//         } else if (button == 2) {
//             System.out.println("Namaste");
//         } else if (button == 3) {
//             System.out.println("Bonjour");
//         } else {
//             System.out.println("Invalid Button");
//         }
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Press the Button..");
//         int button = sc.nextInt();
//         switch(button){
//             case 1: 
//             System.out.println("Hello");
//             break;
//             case 2:
//             System.out.println("Namaste");
//             break;
//             case 3:
//             System.out.println("Bonjour");
//             break;
//             default:
//             System.out.println("Invalid Button");
//         }
//     }
// }
//----------------------FOR LOOP-----------------------
//print the output three times using counter that counter will count and hence increase the counter by one
// public class Main{
//     public static void main(String[] args) {
//        for(int num = 1; num <=10; num++){
//         System.out.print(num + " "); //here we used print instead of println to print nums on single line
//        }
//     }
// }
//----------------------WHILE-----------------------
// public class Main{
//     public static void main(String[] args) {
//         int num = 1;
//         while(num <= 10){
//             System.out.print(num + " ");
//             num++;
//         }
//     }
// }
//----------------------DO WHILE-----------------------
// public class Main{
//     public static void main(String[] args){
//         int num = 1;
//         do{
//             System.out.print(num + " ");
//             num++;
//         }while(num <= 10);
//     }
// }
//PRINT THE SUM OF FIRST N NATURAL NUMBERS;
// public class Main{
//     public static void main(String[] args){
//         int n = 10;
//         int sum = 0;
//         for(int num = 1; num <= n; num++){
//             sum = sum + num;
//         }
//         System.out.print("Sum of first N Natural Numbers are: " + sum);
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a value of n: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i<=n; i++){
//             sum = sum + i;
//         }
//         System.out.print("Sum of first N Natural Numbers are: " + sum);
//     }
// }
//print table of a number input by the user:
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         for(int i=1; i<=10; i++){
//             System.out.println(num + " * " + i + " = " + (num * i));
//         }
//     }
// }
//-----------------------PATERNS (NESTED LOOP)----------------------
// public class Main{
//     public static void main(String[] args){
//         for (int i=1; i<=5; i++){
//             for (int j=1; j<=5; j++){
//                 System.out.print(" *");
//             }
//             System.out.println("");
//         }
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         int n = 4; // Number of rows
//         int m = 5; // Number of columns
//         // Outer loop for rows
//         for (int i = 1; i <= n; i++) {
//             // Inner loop for columns
//             for (int j = 1; j <= m; j++) {
//                 // Condition to print '*' at the borders
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print(" * ");
//                 } else {
//                     System.out.print("   "); // Print space for hollow part
//                 }
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         for(int i = 1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println(" ");
//         }
//     }
// }
// public class Main {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 4-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int n = 5;
//         for (int i=1; i<=n; i++){
//             for (int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 0; i<=n; i++){
//             for(int j = 1; j <= n-i; j++){
//                 System.out.print( j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int n = 5; int num = 1;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print( num+ " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int n = 5; 
//         for (int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++){
//                 if(((i + j) % 2) == 0){
//                     System.out.print(" 1 ");
//                   } else{
//                     System.out.print(" 0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         int n = 5;
//     //upper half
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             //2nd part
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// //lower half
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             int spaces = 2*(n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             //2nd part
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         for(int i = 1; i<=5; i++){
//             for(int j=5; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++){
//             for(int j=5; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Main {

//     public static void main(String args[]) {
        
//      for (int i = 1; i <= 5; i++) {
//             for (int j = 5; j >= i; j--) {
//                 System.out.print(" ");
//             }

//             for (int j = i; j>=1; j--) {
//                 System.out.print( j );
                
//             }

//               for (int j = 2; j<=i; j++) {
//                 System.out.print(j);
                
//             }
//             System.out.println();
//         }
//     }
// }


public class Main {

    public static void main(String args[]) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");

            }

            for (int j = 2; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                }

            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }

            for (int j = n-1; j >= i; j--){
                System.out.print("*");

            }
            System.out.println();
            }
           

        }
    }

