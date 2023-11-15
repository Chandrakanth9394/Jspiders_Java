//WAJ PROGRAM TO SUM OF ALL THE DIGITS IN A STRING

package StringPrograms;

import java.util.Scanner;

public class StringQ8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Alphanumber word: ");
	String str = sc.next();
	int sum=0;
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			int number = (ch-48);
			System.out.println("The numbers are: "+number);
			sum+=number;
		}
	}
	System.out.println(sum);
}
}
