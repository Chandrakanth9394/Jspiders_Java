//WAJ PROGRAM TO CHECK WHEATHER THE STRING IS A PALINDROME OR NOT.

package StringPrograms;

import java.util.Scanner;

public class StringQ10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String str = sc.next();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Palandrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
