package misc10;

import java.util.Scanner;

public class theater {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of pizza brought");
		int pi=sc.nextInt();
	System.out.println("enter number of puffs brought");
	int pu=sc.nextInt();
	System.out.println("enter number of cool drinks brought");
	int co=sc.nextInt();
	System.out.println("Bill details");
	System.out.println("No. of pizzas:"+pi);
	System.out.println("No. of puffs:"+pu);
	System.out.println("No. of cool drinks:"+co);
	System.out.println("Total price:"+(100*pi+20*pu+10*co));
	System.out.println("Enjoy the show!!!");

	}

}
