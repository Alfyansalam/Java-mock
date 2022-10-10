package misc10;

import java.util.Scanner;

public class fuel {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter quantity of fuel to fill up");
		float q=sc.nextInt();
	System.out.println("enter distance covered till tank goes dry");
	float d=sc.nextInt();
	if(q<1)
	{
		System.out.println(q+"is invalid output");
		System.exit(0);
	}
	if(d<1)
	{
		System.out.println(d+"is invalid output");
		System.exit(0);
	}
	System.out.println("liters/100km");
	System.out.println(String.format("%.2f",(q/d)*100));
	System.out.println("miles/galoon");
	System.out.println( String.format("%.2f",(d*0.6214/(q*0.2642))));
	
	
	}

}
