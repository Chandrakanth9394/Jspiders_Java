package StringPrograms;

import java.util.Scanner;

public class StringQ7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the alphanumeric word: ");
	String str = sc.next();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			int number = (ch-48); //converting the character to a number.
			if(number%2==0)
			{
				System.out.println(number);
			}
		}
	}
}
}
