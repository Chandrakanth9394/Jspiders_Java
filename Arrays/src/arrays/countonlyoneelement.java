package arrays;

public class countonlyoneelement {
public static void main(String[] args) {
	int arr[]= {2,3,4,2,3,2,1,3,8};
	int count=0;
	int k=1;
	for(int i=0;i<arr.length;i++)
	{
		if(k==arr[i])
		{
			count++;
		}
	}
	System.out.println("the "+k+" have "+count+" occurances");
}
}
