import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r)
    { this.r = r; }

    public double area()
    { return Math.PI*r*r; }
    public double perimeter()
    { return 2*Math.PI*r; }
}

class Rectangle implements Shape {
    double l,b;
    Rectangle(double l,double b)
    { this.l=l; this.b=b; }

    public double area()
    { return l*b; }
    public double perimeter()
    { return 2*(l+b); }
}

public class inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle  2.Rectangle");
        int ch = sc.nextInt();

        if(ch==1){
            System.out.print("Radius: ");
            Shape s = new Circle(sc.nextDouble());
            System.out.println("Area="+s.area());
            System.out.println("Perimeter="+s.perimeter());
        }
        else if(ch==2){
            System.out.print("Length & Breadth: ");
            Shape s = new Rectangle(sc.nextDouble(),sc.nextDouble());
            System.out.println("Area="+s.area());
            System.out.println("Perimeter="+s.perimeter());
        }
        else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
