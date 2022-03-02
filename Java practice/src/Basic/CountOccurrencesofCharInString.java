package Basic;

public class CountOccurrencesofCharInString {
    public static void main(String[] args) {
        String s = "Java Programming Java oops";
        int count = s.length();
        int count_noa = s.replace("J","").length();
        int total = count - count_noa;
        System.out.println("total amount : "+ total);
    }
}
