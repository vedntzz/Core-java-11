package Basic;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 10;
        int count  = 0 ;
        if (num>1){
            for (int i = 1; i <=num ; i++) {
                if(num%i ==0){
                    count++;
                }
                if(count==2){
                    System.out.println("PRIME!!!");
                }
                else{
                    System.out.println("not a PRime!!");
                }
            }
        }
        else{
            System.out.println("not a Prime Number "+num);
        }
    }
}
