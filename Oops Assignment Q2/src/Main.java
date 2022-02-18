import java.util.ArrayList;
import java.util.*;



public class Main {
    int salary = 10000;

    int total=0;
    public int getSalary(int salary){

        return 0;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        System.out.println(employeeSalaries);
        return total;

    }

    static class Labour extends Main{
        ArrayList<Integer>al= new ArrayList<>();
        @Override
        public int getSalary(int salary) {
            int overtime = 500;
            salary=salary+overtime;
            al.add(salary);

            //System.out.println("Total salary of labour is"+salary);
            return 0;

        }
    }
    static class Manager extends Main{
        ArrayList<Integer> al2=new ArrayList<>();
        @Override
        public int getSalary(int salary) {
            int incentive = 5000;
            salary=salary+incentive;
            al2.add(salary);
            //System.out.println("Total Salary of Manager is"+salary);


            return 0;


        }
    }

    public static void main(String[] args) {
        Labour obj=new Labour();
        Manager obj2= new Manager();
        Main obj3= new Main();
        obj.getSalary(30);
        obj.getSalary(20);
        obj.getSalary(60);
        obj2.getSalary(50);
        obj2.getSalary(80);
        ArrayList<Integer> labour=obj.al;
        //System.out.println(obj.al);
        ArrayList<Integer>manager=obj2.al2;

        obj3.totalEmployeesSalary(labour);
        obj3.totalEmployeesSalary(manager);







    }
}


