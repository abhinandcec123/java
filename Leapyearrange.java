import java.util.Scanner;
class leapyearrange{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int start,end;
	System.out.print("Enter starting year:");
	start=sc.nextInt();
	System.out.print("Enter ending year:");
	end=sc.nextInt();
	System.out.println("Leap years:");
	for(int year=start; year<=end;year++){
	if((year%400==0)||(year%4==0 && year%100!=0)){
	System.out.println(year);
	}
     }
  }
}
