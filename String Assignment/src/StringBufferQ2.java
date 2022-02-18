public class StringBufferQ2 {
    public static void main(String[] args){
        String s2 = "It is used to _ at the specified index position";
        StringBuffer sb = new StringBuffer(s2);
        sb.replace(14,15," ");
        sb.replace(84,85," ");
        System.out.println(sb.insert(14,"insert text"));
        System.out.println(sb.insert(95,"insert text"));
    }
}
