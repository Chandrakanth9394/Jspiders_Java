//Write a java program to reverse an array.

package com.Array;

public class Q5 {
	public static void main(String[] args) {
		int arr[] = { 2, 33, 44, 32, 66, 54 };
		int start = 0;
		int end = arr.length - 1;
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}
}
