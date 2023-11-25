//Write a java problem to do the sum of (2*3)matrix

package com.Array;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
	// int a[][]={{2,3,4},{4,3,5}}; if we want to give the number
	// int b[][]={{4,3,6},{4,7,8}};
	Scanner sc = new Scanner(System.in);
	int a[][] = new int [2][3];
	int b[][] = new int [2][3];
	int result[][]=new int [2][3];
	System.out.println("Enter the matrix 1: ");
	for(int i =0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the matrix 2: ");
	for(int i =0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	for(int i =0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			result[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println("The result matrix is :");
	for(int i =0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(+result[i][j]+" ");
		}
	}
}
}
