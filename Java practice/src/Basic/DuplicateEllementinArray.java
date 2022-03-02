package Basic;

public class DuplicateEllementinArray {
    public static void main(String[] args) {
        String arr[]={"java","java","python","lala","python"};
        for (int i = 0; i <=arr.length-1 ; i++) {
            for (int j = i+1; j <= arr.length-1 ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("found :"+ arr[i]);
                }

            }


        }
    }
}
