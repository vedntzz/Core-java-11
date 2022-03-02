package Colllection;

import java.util.TreeSet;

public class Assignment3 {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<Employee>();
        Employee emp1 = new Employee("Yooohu", 21, 40000,"CSE");
        Employee emp2 = new Employee("Loohu", 22, 80000,"ECE");
        Employee emp3 = new Employee("Toohu", 18, 150000,"MECH");
        Employee emp4 = new Employee("Voohu", 23, 50000,"ESE");
        Employee emp5 = new Employee("Hoohu", 40, 90000,"IT");
        Employee emp6 = new Employee("Noohu", 65, 160000,"MBA");
        Employee emp7 = new Employee("Doodu", 45, 20000,"ML");
        Employee emp8 = new Employee("Soodu", 28, 30000,"CIVIL");
        Employee emp9 = new Employee("Wooho", 50, 170000,"AUTO");
        Employee emp10 = new Employee("Peeho", 47, 50000,"MSC");
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);
        treeSet.add(emp6);
        treeSet.add(emp7);
        treeSet.add(emp8);
        treeSet.add(emp9);
        treeSet.add(emp10);
        System.out.println("treeSet : " + treeSet + "\n");
        for (Employee employee : treeSet) {
            System.out.println("Colllection.Employee Name : " + employee.getName());
            System.out.println("Colllection.Employee Age : " + employee.getAge());
            System.out.println("Colllection.Employee Salary :" + employee.getSalary());
            System.out.println("Colllection.Employee Dept :" + employee.getDept());
            System.out.println("--------------------------------------------");
        }
    }
}

  
