import java.util.*;
import java.util.Scanner;
public class MathOperation {
    int x,y;
    double R;
    void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    void add(){
        this.R=x+y;
        Display();
    }
    void multiply(){
        this.R=x*y;
        Display();
    }void power(){
        this.R=Math.pow(x,y);
        Display();
    }
    void Display(){
        System.out.println(R);
    }
    public static void main(String[] args) {
        MathOperation m1=new MathOperation();
        m1.init();
        m1.add();
        m1.multiply();
        m1.power();  
    }
}
