package Basic;

import java.util.SortedMap;

public class NumberofEvenandOdd {
    public static void main(String[] args) {
        int num = 12345678;
       int  eveen_count = 0 ;
       int odd_count  = 0 ;

       while(num>0){
           int last =num%10;

           if(last%2==0){
               eveen_count++;
           }
           else{
               odd_count++;
           }
           num = num/10;
       }
        System.out.println("Even number - "+ eveen_count);
        System.out.println("Odd number - " + odd_count);

    }
}
