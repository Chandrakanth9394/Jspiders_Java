//Write a java program to find the maximum element in an array.

package com.Array;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int max=arr[0];
		for (int i = 0; i < size; i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
	System.out.println("The maximum element is : "+max);

	}
}
