import java.util.Scanner;

public class SortStringCharacters{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter a string:");
	String input=sc.nextLine();
	
	char[] chars=input.toCharArray();
	
	for(int i=0;i<chars.length -1;i++){
	 for(int j=0;j< chars.length-i-1;j++){
	if(chars[j]> chars[j+1]){
		chars temp= chars[j];
		chars[j]=chars[j+1];
		chars[j+1]=temp;
		}
	}
}

String sortedstring=new String(chars);
ers.java:16: error: ']' expecteders.java:16: error: ']' expected
		chars[j]=char[j+1];
		              ^

		chars[j]=char[j+1];
		              ^

System.out.println("Sorted string in ascending order:"+ SortedString);

sc.close();
}
} 
