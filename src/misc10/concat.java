package misc10;

import java.util.Scanner;


public class concat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter inmates name:");
		String q=sc.nextLine();
	System.out.print("enter inmates father name:");
	String d=sc.nextLine();
	 
	 if(!q.matches("^[a-zA-Z]+\s[a-zA-Z]+)?$")||!d.matches("^[a-zA-Z]*$"))
	 {
		 System.out.println("invalid name");
	 }
	 else
	System.out.println(q.toUpperCase()+" "+d.toUpperCase());


	}

}
