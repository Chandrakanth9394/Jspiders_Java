//Write a program to find out whether a given integer is present in an array or not.

package com.Array;

public class Q2 {
	public static void main(String[] args) {
		int arr[] = { 12, 34, 56, 67, 43 };
		int number = 34;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (number == arr[i]) {
				System.out.println("found at index " + i);
				return;// "Return" terminates the entire function, while "break" only exits the loop.
			}
		}
		System.out.println("Not found");
	}
}
