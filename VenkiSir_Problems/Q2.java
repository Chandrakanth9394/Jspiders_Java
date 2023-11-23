//write a java program to print natural number upto n number

package com.student;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	for(int i =1;i<=num;i++)
	{
		System.out.println(i);
	}
}
}
