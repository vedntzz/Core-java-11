package Basic;

public class OddandEveninArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,23};
        System.out.println("List of even numbers ");
        for (int i = 0; i <=a.length-1 ; i++) {
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println("List of Odd Numbers ");
        for (int i = 0; i <=a.length-1 ; i++) {
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }



    }
}
