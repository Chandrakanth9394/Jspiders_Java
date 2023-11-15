//uppercase characters should be converted into lowercase in a string.
//example: SnAkE
//output: sNaKe
package StringPrograms;

import java.util.Scanner;

public class StringQ6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String str=sc.next();
		String concat = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				concat += (char) (ch + 32);
			} else if (ch >= 'a' && ch <= 'z') {
				concat += (char) (ch - 32);
			}
			else
			{
				concat+=ch;
			}
		}
		System.out.println(concat);
	}
}
