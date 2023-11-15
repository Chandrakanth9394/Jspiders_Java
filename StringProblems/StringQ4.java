//App1$LE3@,2b
//WAJP TO COUNT THE SPECIAL CHARACTERS, NUMBERS,LOWERCASE,UPERCASE IN THE STRING.
package StringPrograms;

import java.util.Scanner;

public class StringQ4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name with special characters: ");
		String name = sc.next();
		int uppercase = 0;
		int lowercase = 0;
		int special_characters = 0;
		int number = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				uppercase++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowercase++;
			} else if (ch >= '1' && ch <= '9') {
				number++;
			} else {
				special_characters++;
			}
		}
		System.out.println("The number of uppercase letters is :" + uppercase);
		System.out.println("The number of lowercase letters is :" + lowercase);
		System.out.println("The number of number letters is :" + number);
		System.out.println("The number of special_characters letters is :" + special_characters);
	}
}
