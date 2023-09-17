package arrays;

public class MergeArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int arr1[]= {6,7,8,9,10};
	int arr2[]= new int [arr.length+arr1.length];
	for(int i=0;i<arr.length;i++)
	{
		arr2[i]=arr[i];
	}
	for(int i=0;i<arr1.length;i++)
	{
		arr2[arr.length+i]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]);
	}
}
}
