package Basic;

public class MaxMinArray {
    public static void main(String[] args) {
        int a[] = {50, 30, 40, 60, 20};
        int max = a[0];
        int min = a[0];
        for (int i = 1; i <= a.length-1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("MAx = " + max);
        for (int i = 1; i <= a.length-1; i++) {
            if (a[i] < min) {
                min= a[i];
            }
    }System.out.println("MIn = "+ min);
    }
}