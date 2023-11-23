//write a java program to check the given number is 
//is even/odd. if its even print the previous 
//number by * with 4. else print next 2nd number * by 2
package com.student;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println((num - 1) * 4);
		} else {
			System.out.println((num + 2) * 2);
		}
	}
}
