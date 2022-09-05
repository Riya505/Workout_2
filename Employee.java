import java.util.*;
import java.util.Scanner;
public class Employee {
    static int empNo;
	double salary;
	static double totalSalary;
    Employee(double salary){
		this.empNo++;
		this.salary=salary;
		totalSalary=totalSalary+salary;
	}
    void Display(){
        System.out.println(empNo+" "+totalSalary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary");
        Employee e1 = new Employee(sc.nextInt());
        e1. Display();
        System.out.println("Enter salary");
        Employee e2 = new Employee(sc.nextInt());
        e2. Display();
        System.out.println("Enter salary");
        Employee e3 = new Employee(sc.nextInt());
        e3. Display();
        System.out.println("Enter salary");
        Employee e4 = new Employee(sc.nextInt());
        e4. Display();
    }
}
