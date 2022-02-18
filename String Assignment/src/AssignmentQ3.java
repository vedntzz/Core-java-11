import java.util.Locale;

public class AssignmentQ3 {
    public static void main(String[] args) {
        String s1 = "Java String pool refers to collection of Strings which are stored in heap memory";
        String s2 = s1.toLowerCase();
        System.out.println("in lower case\t:" + s2);
        System.out.println("in Upper case\t" + s2.toUpperCase());
        System.out.println("replacing\t" + s2.replace('a', '$'));
        if (s1.contains("collection")) {
            System.out.println("It contains word\t");
        } else {
            System.out.println("it doesnt");
        }
        String s3 = "java string pool refers to collection of strings which are stored in heap memory";
        if(s1.equals(s3)){
            System.out.println("both string match");
        }else{
            System.out.println("both doesnt not match");
        }
        if(s1.compareTo(s3)==0){
            System.out.println("its doesn't have comparison");
        }else{
            System.out.println("it has comparison");
        }
    }

}
