import java.util.Scanner;

class AreaofShapes{
	double area(double length,double breadth){
	return length * breadth;
	}
	double area(double side){
	return side*side;
	}
	double area(float r){
	return 3.14*r*r;
	}
	
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	AreaofShapes obj=new AreaofShapes();
	
	System.out.print("Enter the length of the rectangle");
	double length=sc.nextDouble();
	System.out.print("Enter the breadth of the rectangle");
	double breadth=sc.nextDouble();
	System.out.println("Area of Rectangle:"+obj.area(length,breadth));
	System.out.print("\n");
	System.out.print("Enter the side of square");
	double side=sc.nextDouble();
	System.out.print("Area of square:"+obj.area(side));
	System.out.print("\n");
	System.out.print("Enter the radius of circle:");
	float r=sc.nextFloat();
	System.out.println("Area of circle:"+obj.area(r));
	sc.close();
	}
}
	
