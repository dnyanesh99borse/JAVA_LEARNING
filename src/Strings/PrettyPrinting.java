package Strings;

//public class PrettyPrinting {
//    public static void main(String[] args){
//        float a = 453.1294f;
//        System.out.printf("Formatted number is %.2f",a);
//        System.out.println("/n");
//        //Print PI
//        System.out.println(Math.PI);
//        //IF I WANNA PRINT THE PI ROUNDING BY 3
//        System.out.printf("Pie: %.3f",Math.PI);
//    }
//}


//OPERATORS...
//import java.util.*;
//public class PrettyPrinting {
//    public static void main(String[] args){
//        //it is giving the output as 195 which is the addition of ASCII value of
//        //a and b
//        //it is character '';
//        System.out.println('a' + 'b');
//
//        //now this will return concatenated op of strings.
//        System.out.println("a" + "b");
//
//        //now it will give a addition of ASCII value of a + 3
//        System.out.println('a' + 3);
//
//        //now if we want to convert this no. into character then we'll do
//        //TYPE CASTING.
//        System.out.println((char)('a' + 3));
//
//        //if you wanna print the objects then at least one object should be of String type.
//        System.out.println(new Integer(56)+ " " + new ArrayList<>());
//    }
//}


//=========PERFORMANCE============
//public class PrettyPrinting {
//    public static void main(String[] args){
//        String series = " ";
//        for(int i = 0; i < 26; i++){
//            char ch = (char)('a' + i);
//            series = series + ch; //series += ch
//        }
//        System.out.println(series);
//    }
//}



//=========STRINGBUILDER=============

public class PrettyPrinting {
    public static void main(String[] args){
        String series = " ";
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
            series = series + ch; //series += ch
        }
//        System.out.println(series);

        //DIFFERENT METHODS IN STRINGBUILDER...........
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        System.out.println(builder.insert(0,"b"));
        System.out.println(builder.delete(2,5));
        System.out.println(builder.deleteCharAt(2));
        System.out.println(builder.append('x'));
        System.out.println(builder.insert(2,"y"));
        //removes blank spaces.
        System.out.println("            kunal        ".strip());
    }
}

