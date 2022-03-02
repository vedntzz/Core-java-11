package Generic.Learning;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

   /* public static void main(String[] args) {
        IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();
  }*/
   public static void main(String[] args) {
       GenericPrinter<Integer> Printer = new GenericPrinter<Integer>(23);
       Printer.print();
       List<Integer>intlist = new ArrayList<>();
       intlist.add(4);
       intlist.add("sdvsdvs");
       System.out.println(intlist);

   }

}
