package Basic;

public class FactorialNumber {
    public static void main(String[] args) {
        int num  = 10;
         long fact = 1 ;
        for (int i = 1; i <= num ; i++) {
            fact = fact*i;

        }
        System.out.println("Fact of the point = " + fact);
    }
}
