package misc21;

import java.util.ArrayList;

public class arraysum {

	public static void main(String[] args) {
		 
		 ArrayList<Integer> list = new ArrayList() ;
		
		 
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        
	        System.out.println( list.stream().mapToInt(i -> i).sum());
    }
}
 
   
         


