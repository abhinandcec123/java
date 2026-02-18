import java.util.Scanner;
class Studentmarks{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number of Subjects:");
	int n=sc.nextInt();
	int[] marks=new int[n];
	int total=0;
	System.out.println("Enter marks:");
	for(int i=0;i<n;i++){
	marks[i]=sc.nextInt();
	total=total+marks[i];
}
double percentage=(double)total/(n*100)*100;
System.out.println("Total marks="+total);
System.out.println("Percentage="+percentage+"%");
sc.close();
}
}
