package Exceptional_Handling;

class exception {
    int a;
    int b;
    exception(){

        System.out.println("exception Constructor");
    }
    void setno (int a , int b ){
        this.a=a;
        this.b=b;
    }
    int div(){
        return a/b;
    }
}
public class Assingnment1 {
    public static void main(String[] args) throws UnsupportedOperationException {
        exception e1 = new exception();
        e1.setno(6,0);
        try{
            System.out.println(e1.div());
            {
            throw new UnsupportedOperationException("invalid");
        }
        }
        catch (ArithmeticException e){
            System.out.println("ERROR dont divide with zero");
        }
    }


}
