import java.util.*;
public class MathFunction {

    int multiply(int a,int b){
        return a*b;
    }

    float multiply(float x,float y){
        return x*y;
    }
    float multiply(float x,int y){
        return x*y;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    MathFunction m1=new MathFunction();
    System.out.println("Enter 2 integers");
    System.out.println(m1.multiply(sc.nextInt(),sc.nextInt()));
    MathFunction m2=new MathFunction();
    System.out.println(("enter 2 float numbers"));
    System.out.println(m2.multiply(sc.nextFloat(),sc.nextFloat()));
    MathFunction m3=new MathFunction();
    System.out.println("enter 1 float number and 1 integer");
    System.out.println((m3.multiply(sc.nextFloat(),sc.nextInt())));
}
}
