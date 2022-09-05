import java.util.*;
public class execution {
    static int count=0;
    {
        count++;
    }
    public execution(){
        System.out.println("Enter details:");
    }
    public execution(String str){
        System.out.println("Name "+str+" saved");
    }
    public execution(int x){
        System.out.println("Id "+x+" saved");
    }
    public execution(double y){
        System.out.println("Salary "+y+" saved");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        execution e1=new execution();
        System.out.println("Enter name");
        execution e2=new execution(sc.next());
        System.out.println("Enter EmpId");
        execution e3=new execution(sc.nextInt());System.out.println("Enter salary");
        execution e4=new execution(sc.nextDouble());
        System.out.println("Number of instances of the class created during execution:"+execution.count);
    } 
}
