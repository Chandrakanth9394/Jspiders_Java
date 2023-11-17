//WAJ PROGRAM TO SEARCH A CHARACTER IN STRING.

package StringPrograms;

import java.util.Scanner;

public class StringQ14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the word: ");
	String word = sc.next();
	System.out.println("enter the character you want to search:");
	char c =sc.next().charAt(0);
	for(int i=0;i<=word.length()-1;i++)
	{
		char ch = word.charAt(i);
		if(c==ch)
		{
			System.out.println("the character exits ");
			return; //"Return" terminates the entire function, 
			        // while "break" only exits the loop. Consequently, using "return" inside a loop can lead to the premature termination of the entire program if not handled carefully.
		}
	}
	System.out.println("does not exits");
}
}
