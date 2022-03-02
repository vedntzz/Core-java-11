package Data_Struture;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the arrays");
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i]= input.nextInt();
        }
        System.out.println("Number to find -");
        int check_value = input.nextInt();
        boolean isthere = false;
        for (int j = 0; j < array.length; j++) {
            if(array[j] == check_value){
                isthere = true;
                System.out.println("Array Contains "+check_value);
            }
        } if (!isthere) {
            System.out.println("not there" );
        }

    }
}
