package DS;

import java.util.Scanner;

public class Assignement4 {
    public static void main(String[] args) {
        System.out.println("Enter marks here : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Maths ");
        int num = input.nextInt();
        System.out.println("Science ");
        int num2 = input.nextInt();
        System.out.println("English  ");
        int num3 = input.nextInt();
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
        if(num<60 && num2>=60 && num3>=60) {
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
