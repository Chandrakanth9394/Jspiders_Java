package arrays;

public class Reverse {
public static void main(String[] args) {
	int arr[]= {15,54,58,65,57,99,23};
	int temp,start=0,end=arr.length-1;
	while(start<=end)
	{
		 temp = arr[start];
		 arr[start]=arr[end];
		 arr[end]=temp;
		 start++;
		 end--;
	}
	for(int i:arr)
	{
		System.out.println(i);
	}
}
}
