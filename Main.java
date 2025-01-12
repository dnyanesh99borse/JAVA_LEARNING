
// import java.util.Scanner;
// public class Main{
//     public static void PrintFactorial(int n){
        //    if(n<0){
        //     System.out.println("Invalid Number: ");
        //    }
//         int fact = 1;
//          for(int i = 1; i <= n; i++){
//             fact = fact*i;
//          }
//          System.out.println("factorial of "+ n + " is : "+fact);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         PrintFactorial(n);
//     }
// }

// import java.math.BigInteger;
// import java.util.Scanner;

// public class Main {
//     public static void PrintFactorial(int n) {
//         if (n < 0) {
//             System.out.println("Factorial is not defined for negative numbers.");
//             return;
//         }

//         BigInteger factorial = BigInteger.ONE; // Initialize factorial as 1
//         for (int i = 1; i <= n; i++) {
//             factorial = factorial.multiply(BigInteger.valueOf(i)); // Multiply by current i
//         }

//         System.out.println("The factorial of " + n + " is: " + factorial);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt(); // Take input from the user
//         PrintFactorial(n); // Call the method to calculate factorial
//     }
// }

// import java.util.*;
// public class Main{
//     public static void PrintAverage(int a,int b,int c){
//         float Average = ((a+b+c)/3);
//         System.out.print("The average of the three numbers a b c is: ");
//         System.out.println(Average); 
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of b: ");
//         int b = sc.nextInt();
//         System.out.print("Enter the value of c: ");
//         int c = sc.nextInt();

//         PrintAverage(a, b, c);
        
//     }
// }


//==================PROGRAM TO FIND THE ODD NUMBERS BETN ONE TO N==========
// import java.util.Scanner;

// public class Main{
//     public static void FindOdd(int n){
//         int OddSum = 0;
//         for(int i=1; i<=n; i++){
//             if((i%2) != 0){
//                 // int OddSum;
//                 OddSum += i;
//             }
//         }
//         System.out.print(OddSum + " ");
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         FindOdd(n);
//     }
// }



//==================PROGRAM TO FIND THE SUM OF ODD NUMBERS BETN ONE TO N==========
// import java.util.Scanner;

// public class Main{
//     public static void FindOdd(int n){
//         int OddSum = 0;
//         for(int i=1; i<=n; i++){
//             if((i%2) != 0){
//                 // int OddSum;
//                 OddSum += i;
//    System.out.print(OddSum + " ");
//             }
//         }
        
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         FindOdd(n);
//     }
// }



//===================GREATER AMONG TWO NUMBERS=====================
// import java.util.Scanner;

// public class Main{
//     public static void FindGreat(int a, int b){
//         if(a>b){
//             System.out.println(a + " is greater");
//         }else{
//             System.out.println(b + " is greater");
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         FindGreat(a, b);
        
//     }
// }



//================TAKE RADIUS FROM USER AND RETURN CIRCUMFERENCE OF CIRCLE=======================
// import java.util.*;
// public class Main{
//     public static void FindCircumference(double r){
//         double Circum = (2*Math.PI*r);
//         System.out.println("The circumference of the circle is: " + Circum);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the radius of the circle: ");
//         double r = sc.nextDouble();
//         FindCircumference(r);
//     }
// }


//====================AGE 18 ALLOWS TO VOTE===================
// import java.util.Scanner;
// public class Main{
//     public static void Vote(int age){
//         if(age>=18){
//             System.out.println("you are eligible for voting");
//         }else{
//             System.out.println("you are not eligible for voting");
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();
//         Vote(age);
//     }
// }



