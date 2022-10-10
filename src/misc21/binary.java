package misc21;

public class binary {

	public static void main(String[] args) {
		int mid,low,high;
		int key=1,a[]= {1,2,3,4,5};
low=0;
high=4;
mid=(low+high)/2;
while(low<=high)
{
	if(key<a[mid])
		high=mid-1;
	else if(a[mid]==key)
	{
		System.out.println("Element found!"); 
		break;
	}
		
	else
		low=mid+1;
	mid = (low + high)/2;  
	
}
if ( low > mid ){  
    System.out.println("Element is not found!");  
 }  
	}

}
