import java.util.*;
import java.util.Scanner;
public class Employe {
    int emp_id,result,ass1,ass2,ass3;
    String name;
    double total,Result;
    Employe(String name,int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }
    void check(int ass1,int ass2,int ass3){
        this.ass1=ass1;
        this.ass2=ass2;
        this.ass3=ass3;
        if(ass1>=75 && ass2>=75 && ass3>=75){
            System.out.println("promoted");
        }
        else{
            System.out.println("demoted");  
        }
    }
    void calculation(){
        total=ass1 + ass2 + ass3;
        Result=(total/300)*100;
        System.out.println("Total marks="+total);
        System.out.println("Result="+Result);
    }
public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Employe name and employee id");
            Employe e1=new Employe(input.next(),input.nextInt());
            System.out.println("Enter the mark of 3 assesments");
            e1.check(input.nextInt(),input.nextInt(),input.nextInt());
            e1.calculation(); 
        }
}






