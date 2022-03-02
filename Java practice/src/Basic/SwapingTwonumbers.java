package Basic;

public class SwapingTwonumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;
        System.out.println("Before "+a+" "+b);
        a = a +b; // a = 30
        b = a - b ; // b = 10
        a = a-b; // a = 30 - 10 = 20

        System.out.println("After "+ a +" "+b);




    }
}


