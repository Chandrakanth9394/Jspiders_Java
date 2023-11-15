//Given a string str, write a Java program to print all words with even length in the given string. Examples:
//
//Input: s = "This is a java language"
//Output: This
//        is
//        java
//        language 
//
//Input: s = "i am GFG"
//Output: am
package StringPrograms;

import java.util.Scanner;

public class StringQ11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = sc.nextLine();
		String words[] = str.split(" ");//spliting when the space comes.
//	for(String w:words)
//	{
//		System.out.println(w);
//	}
		for (int i = 0; i <= words.length - 1; i++) {
			int length = words[i].length();
			if (length % 2 == 0) {
				System.out.println(words[i]);
			}
		}
	}
}
