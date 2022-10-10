package misc10;

import java.util.ArrayList;
import java.util.Scanner;
public class least {

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int p[]=new int[10];
        int l=1000,s;
        String a[][] = new String[n][6];
        for(int i=0;i<n;i++) {
            String item = sc.next();
            a[i] = item.split(",");            
        }
        for(int i=0;i<n;i++)
        {
            
                p[i]=(Integer.parseInt(a[i][1])*Integer.parseInt(a[i][2]))/100;
                
            
        }
        for(int i=0;i<n;i++)
        {
           if(p[i]<l)
           {
               l=p[i];
           }
        }
        for(int i=0;i<n;i++)
        {
           if(p[i]==l)
           {
               System.out.println(a[i][0]);
           }
        }
   }
}