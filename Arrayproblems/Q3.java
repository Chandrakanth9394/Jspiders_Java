//Calculate the average marks from an array cotaining marks of all students in physics using for-each loops.
package com.Array;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements in the array: ");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int average, sum = 0;
		for (int i : arr) {
			sum += i;
		}
		average = sum / size;
		System.out.println(average);
	}
}
