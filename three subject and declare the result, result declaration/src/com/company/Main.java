package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num ;
        int num2;
        int num3;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter score for Maths: ");
        num = reader.nextInt();
        System.out.println("Enter score Science: ");
        num2 = reader.nextInt();
        System.out.println("Enter score Social Science: ");
        num3 = reader.nextInt();
        if (num>=60 && num2 >=60 && num3>=60)
        {
            System.out.println("Pass!");
        }
        if(num>=60 && num2 >=60 && num3<60)
        {
            System.out.println("Promoted");
        }
        if(num>=60 && num2<60 && num3>=60)
        {
            System.out.println("Promoted");
        }
        if(num<60 && num2>=60 && num3>=60)
        {
            System.out.println("Promoted");
        }

        if(num<60 && num2<60 && num3<60)
        {
            System.out.println("Fail!");
        }
        if(num>=60 && num2<60 && num3<60)
        {
            System.out.println("Fail!");
        }
        if(num<60 && num2>=60 && num3<60)
        {
            System.out.println("Fail!");
        }
        if(num<60 && num2<60 && num3<=60)
        {
            System.out.println("Fail!");
        }

    }
}
