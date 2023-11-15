//Given a String, the task is to insert another string in between the given String at a particular specified index in Java.
//
//Examples:
//
//Input: originalString = "GeeksGeeks", 
//              stringToBeInserted = "For", 
//              index = 4
//Output: "GeeksForGeeks"

package StringPrograms;

import java.util.Scanner;

public class StringQ12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.next();
	System.out.println("enter the word you want to insert and the index:");
	String word=sc.next();
	int index = sc.nextInt();
	String newstring = "";
	for(int i=0;i<=str.length()-1;i++)
	{
		char ch = str.charAt(i);
		newstring +=ch;
		if(i==index)
		{
			newstring+=word;
		}
	}
	System.out.println(newstring);
}
}
