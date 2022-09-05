import java.util.*;
public class Rectangle {
    int length,breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int getArea(){
        return length*breadth;
    }
    int getPerimeter(){
        return 2*(length+breadth);
    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(10, 5);
        System.out.println("Length = " + obj.length);
        System.out.println("Breadth = " + obj.breadth);
        System.out.println("Area = " + obj.getArea());
        System.out.println("Perimeter = " + obj.getPerimeter());
    }
}

