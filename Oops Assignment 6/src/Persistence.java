abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist(){
        return "File persistance";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Data persistence";
    }
}
public class AssignmentQ6 {
    public static void main(String[] args) {

        Persistence persistence = new Persistence() {
        };

    }

}



