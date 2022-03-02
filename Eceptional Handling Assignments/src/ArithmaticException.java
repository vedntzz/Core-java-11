//Assignments on Exception Handling
/* Question -1.	Write an application that accepts two numbers,
 divides the first number with the second number and display the result.
 Hint: You need to handle ArithmeticException which is thrown when
 there is an attempt to divide a number by zero. */
class exception{
    int a;
    int b;
    exception(){
        System.out.println("exception Constructr");
    }
    void setno (int a , int b){
        this.a = a;
        this.b = b;
    }
    int div(){
        return a/b;
    }
}
public class ArithmaticException {
    public static void main(String[] args) {
        exception e1 = new exception();
        e1.setno(6,0);
        try{
            System.out.println(e1.div());
        }
        catch (ArithmeticException e){
            System.out.println("Ullu ka patha");
        }
    }
}


