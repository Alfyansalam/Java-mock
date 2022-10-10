package misc21;

public class linear {

	public static void main(String[] args) {
		int key=6,a[]= {1,2,3,4,5};
		for(int i=0;i<5;i++)
		{
			if(a[i]==key)
			{
				System.out.println("item found");
			System.exit(0);
			}
		}
		System.out.println("item not found");
	}

}
