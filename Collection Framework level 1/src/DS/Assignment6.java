package DS;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sp = " ";
        System.out.println("Enter your Username: ");
        String credential_ID = input.nextLine();
        if ((credential_ID.contains(sp)) || credential_ID.length() < 4) {
            System.out.println("Invalid Username");
            return;
        }
        System.out.println("Enter Your Password");
        String credential_Pass = input.nextLine();
        if ((credential_Pass.contains(sp)) || credential_Pass.length() < 8) {
            System.out.println("Invalid Username");
        } else {
            System.out.println(credential_ID + " Welcome");
        }
        System.out.println("Enter userid");
        String userid = input.nextLine();
        System.out.println("Enter password");
        String pass = input.nextLine();
        while (!userid.equals(credential_ID) || !pass.equals(credential_Pass)) {
            System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter userId");
                userid = input.nextLine();
                System.out.println("Enter Password");
                pass = input.nextLine();
                if (userid.equals(credential_ID) && pass.equals(credential_Pass))
                    break;
                if (i == 2)
                    System.out.println("You have entered wrong credentials 3 times");
                else
                    System.out.println("You have entered wrong credentials ,please enter the right credentials.");
            }


        }
    }
}