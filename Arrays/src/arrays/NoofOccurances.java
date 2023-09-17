package arrays;
public class NoofOccurances {
public static void main(String[] args) {
	int arr[]= {10,23,32,23,21,23,10};
	boolean counted[]=new boolean[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		if(counted[i] == false)
		{
			int k=arr[i], count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(k==arr[j])
				{
					count++;
					counted[j]=true;
				}
			}
			System.out.println(k+" has "+count+" occurances");
		}
	}
}
}
