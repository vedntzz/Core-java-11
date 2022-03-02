package Generic;
class Generic<k,v>
{
    k key;
    v value;

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public void setValue(v value) {
        this.value = value;
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Generic<String,String>obj1 = new Generic<String, String>();
        obj1.setKey("1");
        obj1.setValue("Hello");
        Generic<Object, Object> ob2=new Generic<>();
        ob2.setKey("Today is");
        ob2.setValue(new java.util.Date());
        System.out.println(obj1.getKey()+" "+obj1.getValue());
        System.out.println(ob2.getKey()+" "+ob2.getValue());
    }

}
