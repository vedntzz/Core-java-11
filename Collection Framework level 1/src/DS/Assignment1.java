package DS;

public class Assignment1 {
    public static void main(String[] args) {
        int number = 37;
        int originalNumber;
        int remainder;
        int result = 0 ;
        originalNumber = number;
        while (originalNumber != 0 ){
            remainder = originalNumber%10;
            result += Math.pow(remainder,3);//r*r*r
            originalNumber /= 10 ;
        }
        if(result == number){
            System.out.println(number + " is a Arms number");
        }else{
            System.out.println("nai hai bro ");
        }

    }

}
