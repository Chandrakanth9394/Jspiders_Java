//WRITE A JAVA PROGRAM TO FIND THE GREATEST EVEN NUMBER FROM THE ARRAY?

package array;

public class GreatestEvenNumber {
public static void main(String[] args) {
	int arr[]= {10,13,15,16,18,99,100,109,59,110,54};
	int max = arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if((arr[i]%2==0)&&(arr[i]>max))
		{
			max=arr[i];
		}
	}
	System.out.println(max);
}
}
