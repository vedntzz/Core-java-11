package Basic;

public class NumberOfDigitsinaNumber {
    public static void main(String[] args) {
        int num =  123465;
        int count = 0 ;
        while (num>0){
            num = num/10;
            count++;
        }
        System.out.println("Count of your number "+ count);

    }
}
