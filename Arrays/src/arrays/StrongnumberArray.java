package arrays;

import java.util.Scanner;

public class StrongnumberArray {
	public static int factorial(int num)
	{
		int i,fact=1;
				for(i=1;i<=num;i++)
				{
					fact*=i;
				}
				return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
        {
        	int num=arr[i],temp=num,sum=0;
    		while(temp!=0)
    		{
    			int a = temp%10;
    			sum=sum+factorial(a);
    			temp/=10;
    		}
    		if(sum==num)
    		{
    			System.out.println(num);
    		}
    	
        }
	}
}
