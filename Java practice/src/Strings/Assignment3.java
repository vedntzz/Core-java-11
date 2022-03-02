package Strings;

import java.util.Locale;

public class Assignment3 {
    public static void main(String[] args) {
        String s1 = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("in lower"+ s1.toLowerCase());
        System.out.println("in upper"+ s1.toUpperCase());
        System.out.println("REPLACE"+s1.replace("a","$"));
       if(s1.contains("collection")){
           System.out.println("it contains ");
       }else{
           System.out.println("it doesn't contains");
       }
        String s3 = "java string pool refers to collection of strings which are stored in heap memory";
       if(s1.equals(s3)){
           System.out.println("both are equal");
       }else{
           System.out.println("its not equal");
       }
       if(s3.compareTo(s1)==0){
           System.out.println("it doesn't compare");
       }else{
           System.out.println("It was comprable");
       }

    }



}
