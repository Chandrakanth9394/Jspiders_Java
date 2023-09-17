package arrays;
import java.util.*;
public class FactorialArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	int j,fact=1,n=arr[i];
	for(j=1;j<=n;j++)
	{
		fact*=j;
	}
	System.out.println(fact);
}
}
}
