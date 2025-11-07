//------------------MY LOGIC-------------------

// import java.util.*;

// public class MajorElement{
//     public static int majorityelement(int n, int[] arr){
//         int temp = n/2 , count = 0, majorelem = arr[0];
//         for(int i = 0; i<n; i++){
//            for(int j = i; j<n; j++){
//             if(arr[i] == arr[j]){
//                 count++;
//             } 
//            }
//            if(count > temp) majorelem = arr[i];
//         }
//         return majorelem;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i< n; i++) arr[i] = sc.nextInt();
//         System.out.println("Output is: " + majorityelement(n, arr));
//     }
// }


//------------OPTIMAL LOGIC WITH O(N)---------------//
//here it is not checking for the same element again..like my code.

import java.util.*;

public class MajorElement{
    public static int majorityElement(int[] nums){
        int count = 0, candidate = 0;
        for(int num: nums){
            if(count == 0) candidate = num;
            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(majorityElement(a));
    }
}