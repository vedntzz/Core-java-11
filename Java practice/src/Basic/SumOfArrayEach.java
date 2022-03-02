package Basic;

public class SumOfArrayEach {
    public static void main(String[] args) {
        int array[] = new int[]{5, 2,34,343,454,223,343432};
        int sum = 0 ;
        for (int i = 0; i <=array.length-1; i++) {
            sum = sum+array[i];

        }
        System.out.println("Sum is - " +sum);
    }
}
