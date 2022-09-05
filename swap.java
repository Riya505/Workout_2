import java.util.*;
import java.util.Scanner;
public class swap {
    int x,y;
    void swapp(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("Before swaping numbers "+x+" "+y);
        this.x=this.x+this.y;
        this.y=this.x-this.y;
        this.x=this.x-this.y;
        System.out.println("after swapping numbers by call by value "+x+" "+y);
    }
    void swaping(swap r){
        System.out.println("Before swaping numbers "+r.x+" "+r.y);
        r.x=r.x+r.y;
        r.y=r.x-r.y;
        r.x=r.x-r.y;
        System.out.println("after swapping numbers by call by reference "+r.x+" "+r.y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        swap s1=new swap();
        System.out.println("Enter the value for x and y");
        s1.swapp(sc.nextInt(),sc.nextInt());
        swap s2=new swap();
        s2.swaping(s1);
    }
}
