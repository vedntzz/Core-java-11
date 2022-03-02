import java.lang.annotation.*;

public class Assignment1 {
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @ interface Test{
        //Marker type
    }
    static class Anno{
        @Test
        public void notation(){
            System.out.println("It runs faster");
        }
    }

    public static void main(String[] args) {
        Anno obj= new Anno();
        obj.notation();
    }
}
