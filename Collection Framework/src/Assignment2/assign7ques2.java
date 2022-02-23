package Assignment2;
import java.util.HashSet;
public class assign7ques2 {
    public static void main(String[] args) {
        HashSet<Unique> pr = new HashSet<>();
        pr.add(new Unique(20));
        pr.add(new Unique(40));
        pr.add(new Unique( 30));
        for(Unique prt:pr){
            System.out.println(prt);
        }
        Unique duplicate = new Unique(20);
        System.out.println("inserting duplicate object...");
        pr.add(duplicate);
        System.out.println("After insertion:");
        for(Unique prt:pr){
            System.out.println(prt);
        }
    }
}

