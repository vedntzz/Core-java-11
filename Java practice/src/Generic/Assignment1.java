package Generic;


import java.util.HashSet;

class Employees
{
    int empid,empSalary;
    String empName,empDept;
    public Employees(int empid,String empName,int empSalary,String empDept){
        super();
        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDept = empDept;

    }
    public String display(){
        return "Employees [empid=" + empid + ", empSalary=" + empSalary + ", empName=" + empName + ", empDept=" + empDept
                + "]";
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Employees e = new Employees(101,"lala", 50000,"Finance");
        Employees e1=new Employees(101,"Sourav",50000,"Finance");
        Employees e2=new Employees(102,"Simran",45000,"IT");
        Employees e3=new Employees(103,"Krishna",55000,"Tax");
        HashSet<Employees>employees = new HashSet<>();
        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        for (Employees i: employees){
            System.out.println(e.display());
        }
    }

}
