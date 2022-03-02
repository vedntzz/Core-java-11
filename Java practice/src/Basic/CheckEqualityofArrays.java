package Basic;

import java.util.Arrays;

public class CheckEqualityofArrays {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {1,2,3,4,3};

        boolean lol = Arrays.equals(a1,a2);
        if(lol==true){
            System.out.println("Equal hai bhai ");

        }else{
            System.out.println("not Equal bhai change krle");
        }



    }
}
