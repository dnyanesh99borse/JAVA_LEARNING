
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


//========================INFINTE LOOP USING DO-WHILE=======================
// import java.util.Scanner;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int i = 1;
//         do{
//             System.out.println("DEFINATELY I WILL BECOME SUCCESSFULL INDEPENDET BILLIONAIRE AND BUSINESS TYCOON..!");
//             i++;
//         }while(i<=10);
//     }
// }


//================TAKE INPUT FROM THE USER UPTO USER WANT AND RETURN THE COUNT OF +VE -ve AND 0's======================//
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int positiveCount = 0, negativeCount = 0, zeroCount = 0;
//         char choice;
        
//         do {
//             System.out.print("Enter a number: ");
//             int number = sc.nextInt();
            
//             if (number > 0) {
//                 positiveCount++;
//             } else if (number < 0) {
//                 negativeCount++;
//             } else {
//                 zeroCount++;
//             }
            
//             System.out.print("Do you want to continue? (y/n): ");
//             choice = sc.next().charAt(0);
//         } while (choice == 'y' || choice == 'Y');
        
//         System.out.println("\nSummary:");
//         System.out.println("Positive numbers: " + positiveCount);
//         System.out.println("Negative numbers: " + negativeCount);
//         System.out.println("Zeros: " + zeroCount);
        
//         sc.close();
//     }
// }



// import java.util.*;
// public class Main{
//         public static  void Power(int x,int n){
//                 if(n == 0){
//                          System.out.println("the "+ x + " to the power " + n + " is: 1 ");
//                 }else{
//                         double Power = Math.pow(x,n);
//                         System.out.println(x+" raise to the power " + n + " is: "+ Power);
//                 }
//         }

//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the value of x: ");
//                 int x = sc.nextInt();
//                 System.out.println("Enter the value of n: ");
//                 int n = sc.nextInt();
//                 Power(x, n);
//         }
//         }


// import java.util.*;
// public class Main{
//         public static void GCDCAL(int a, int b){
//                 if(b == 0){
//                   System.out.println("GCD of " + a + " and " + b + " is" + a);
//                 }else{
//                         while(b != 0){
//                         int temp = b;
//                         b = a % b;
//                         a = temp;
//                         }
//                         System.out.println("GCD of " + a + " and " + b + " is: " + a);
//                 }
//         }

        
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the value of a: ");
//                 int a = sc.nextInt();
//                 System.out.println("Enter the value of b: ");
//                 int b = sc.nextInt();
//                 GCDCAL(a, b);
//         }

// }


//=====================PROGRAM TO FIND FIBONACCI SERIES===========================
// import java.util.*;
// public class Main{
//         public static void FindFibonacci(int n){
//         int a = 0;
//         int b = 1;
//         for(int i = 0; i<=n; i++){
//         int ans = a + b;
//         System.out.print(ans + " ");
//         a = b;
//         b = ans;
//         }
// }
        

//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the value of n: ");
//                 int n = sc.nextInt();
//                 FindFibonacci(n);
//         }

// }


//=============================ARRAYS================================
import java.util.*;
public class Main{
        p
}