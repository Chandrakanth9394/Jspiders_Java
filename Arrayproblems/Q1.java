//create an array of 5 float and calculate thier sum?

package com.Array;

public class Q1 {
	public static void main(String[] args) {
		float arr[] = new float[5];
		arr[0] = 32.3f;
		arr[1] = 34.3f;
		arr[2] = 23.3f;
		arr[3] = 3.23f;
		arr[4] = 32.43f;
		float sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			System.out.println(arr[i] + " ");
		}
		System.out.println(sum + " = " + arr[0] + " + " + arr[1] + " + " + arr[2] + " + " + arr[3] + " + " + arr[4]);
	}
}
