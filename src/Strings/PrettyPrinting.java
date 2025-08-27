package Strings;

import java.sql.SQLOutput;

public class PrettyPrinting {
    public static void main(String[] args){
        float a = 453.1294f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.println("/n");
        //Print PI
        System.out.println(Math.PI);
        //IF I WANNA PRINT THE PI ROUNDING BY 3
        System.out.printf("Pie: %.3f",Math.PI);
    }
}
