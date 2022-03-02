package Basic;

public class RemoveJunkCharinaString {
    public static void main(String[] args) {
        String s = "#!@$!#!^#^&^$^ lala hi ";
        s = s.replace("[^a-zA-Z0-9]"," ");
        System.out.println(s);

    }
}
