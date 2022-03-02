package Data_Struture;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Assingment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();
        if(salary>=181001 && salary<=300000)
            System.out.println(salary*.1);
        else if (salary>=300001&& salary<=500000)
            System.out.println(salary*.2);
        else if (salary>=500001 && salary<=1000000)
            System.out.println(salary*.3);
        else
            System.out.println("Nil");
    }


}
