//WAJ PROGRAM TO REVERSE A STRING.

package StringPrograms;

public class StringQ9 {
public static void main(String[] args) {
	String str = "chandrakanth";
	String reversedstring ="";
	for(int i=str.length()-1;i>=0;i--)
	{
		char ch = str.charAt(i);
		reversedstring += ch;
	}
	System.out.println(reversedstring);
}
}
