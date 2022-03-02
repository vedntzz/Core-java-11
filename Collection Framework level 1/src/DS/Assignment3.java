package DS;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal : ");
        double principal = input.nextDouble();
        System.out.println("Enter rate = ");
        double rate = input.nextDouble();
        System.out.println("Enter the time = ");
        double time = input.nextDouble();
        System.out.println("Enter interest in years");
        double years = input.nextDouble();
        double simpleInterest = (principal*time*rate)/100;
        double interest = principal* (Math.pow((1 + rate/100), (time * years))) - principal;
        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Number of Time interest Compounded: " + years);
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + interest);


    }
}
