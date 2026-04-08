import java.util.Scanner;
class JavaOver{ 
void Calculate(){}
}

class Add extends JavaOver{

void Calculate (int a,int b)
{
  return a + b;
} 
  class Sub extends JavaOver{ 
  
  void Calculate(int a,int b,int c)
 {
 
  return a-b-c;
 }
 }
 class Mul extends JavaOver{  
 
 void Calculate(int a,int b,int c)
 {

  return a*b*c;
 }
 }
  public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  JavaOver Cal  =new JavaOver();
   Cal=sc.nextInt();
   Add Adds=new Add();
   Add=sc.nextInt();
    Sub Subs=new Sub();
   Sub=sc.nextInt();
   Mul Mulin=new Mul();
  Mul=sc.nextInt();
   
  {
  System.out.print("Addition "+Add(1,2));
  System.out.print("Subtraction "+Sub(2,3));
  System.out.print("Multiplication"+Mul(3,4));
  }
  sc.close();
  }
  }
  
