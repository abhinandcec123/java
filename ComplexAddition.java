import java.util.Scanner;
class ComplexAddition{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter real part of first complex number:");
	int r1=sc.nextInt();
	System.out.print("Enter imaginary part of first complex number:");
	int i1=sc.nextInt();
	System.out.print("Enter real part of second complex number:");
	int r2=sc.nextInt();
	System.out.print("Enter imaginary part of second complex number:");
	int i2=sc.nextInt();
	int real=r1+r2;
	int imag=i1+i2;
	System.out.println("Sum="+real+"+"+imag+"i");
	}
}
