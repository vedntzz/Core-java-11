abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist(){
        System.out.println("File persistence");
        return null;
    }

}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        System.out.println("Data persistence");
        return null;
    }
}



