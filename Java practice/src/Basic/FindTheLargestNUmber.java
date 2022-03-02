package Basic;

public class FindTheLargestNUmber {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 200;
        if (a > b && a > c) {
            System.out.println("A is the largest " + a);
        }
        if (b > a && b > c) {
            System.out.println("B is the Largest " + b);
        }
        if (c > a && c > b) {
            System.out.println("C is the Largest " + c);
        }

    }
}