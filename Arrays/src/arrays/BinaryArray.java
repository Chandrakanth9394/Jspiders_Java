package arrays;
import java.util.*;
public class BinaryArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int size = sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter the elements:");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
//--------------------------------------
	System.out.println("enter the element you want to search:");
	int k = sc.nextInt(); //getting the element from the user
	int low =0,high=arr.length-1;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(k==arr[mid])
		{
			System.out.println("element found");
			return;
		}
		else if(k>=arr[mid])
		{
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
	}
	System.out.println("element not found");
}
}
