//Linear array

package arrays;
import java.util.*;
public class SearchAElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element ");
	int element = sc.nextInt();
	System.out.println("Enter the size : ");
	int size = sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the values : ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		if(element==arr[i])
		{
			System.out.println("Element found at "+i);
			return;
		}
	}
	System.out.println("Element not exit");
}
}
