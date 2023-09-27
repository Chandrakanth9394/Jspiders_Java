//WRITE A JAVA PROGRAM TO MERGE THE ARRAY 
//EX ARR1={5,10,20,30}
//ARR2={45,26,38,42}
//ARR3={5,10,20,30,42,38,26,45}

package array;

public class MergetheArray {
public static void main(String[] args) {
	int arr1[]= {5,10,20,30};
	int arr2[]= {45,26,38,42};
	int arr2d[] = new int [arr2.length];
	int arr3[]= new int[arr1.length+arr2.length];
	for(int i=arr2.length-1;i>=0;i--)
	{
		arr2d[i] = arr2[i];
	}
	for(int i=0;i<arr1.length;i++)
	{
		arr3[i]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++)
	{
		arr3[arr1.length+i]=arr2d[i];
	}
	for(int i=0;i<arr3.length;i++)
	{
		System.out.println(arr3[i]);
	}
}
}
