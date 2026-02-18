class Product{
int pcode;
String pname;
double price;
Product(int e,String n,double p){
pcode=e;
pname=n;
price=p;
}
public static void main(String args[]){
Product p1=new Product(101,"Pen",10);
Product p2=new Product(102,"Book",50);
Product p3=new Product(103,"Pencil",5);
Product low=p1;
if(p2.price<low.price);
 low=p2;
if(p3.price<low.price);
 low=p3;
System.out.println("Lowest price product:");
System.out.println("pcode:",low.pcode+" "+"pname:",low.pname+" "+"price:",low.price);
}
}

