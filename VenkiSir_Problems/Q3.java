//write a java program print even number upto n without using conditional statement

package com.student;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	for(int i=0;i<=num;i+=2)
	{
		System.out.println(i);
	}
}
}
