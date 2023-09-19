package arrays;

public class GreatestElement {
public static void main(String[] args)
{
	int arr[]= {57,14,15,10,88,23};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>=max)
		{
			max=arr[i];
		}
		if(arr[i]<= min)
		{
			min=arr[i];
		}
	}
	System.out.println("The greatest element in the array "+max);
	System.out.println("The smallest element in the array "+min);
}
}
