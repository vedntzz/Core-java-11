//import Execute.Execute;

import java.lang.reflect.*;
import java.util.*;


class Myclass {

    @Execute(Sequence=2)
    public void myMethod1()
    {
        System.out.println("1");
    }
    @Execute(Sequence=1)
    public void myMethod2()
    {
        System.out.println("2");

    }

    @Execute(Sequence=3)
    public void myMethod3()
    {
        System.out.println("3");
    }
}
public class Assignment3 {

    public static void main(String args[])throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Amount to withdraw : ");
        double withdrawAmount = scan.nextDouble();


        Myclass n = new Myclass();
        Method a= n.getClass().getMethod("myMethod1");
        Method b= n.getClass().getMethod("myMethod2");
        Method c= n.getClass().getMethod("myMethod3");
        Execute a1E= a.getAnnotation(Execute.class);
        Execute b1E = b.getAnnotation(Execute.class);
        Execute c1E = c .getAnnotation(Execute.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}