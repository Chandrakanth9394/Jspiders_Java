//WAJP TO COUNT THE UPPERCASE AND LOWERCASE CHARACTERS IN A STRING.

package StringPrograms;

public class StringQ3 {
	public static void main(String[] args) {
		String name = "ChAndraKANth";
		int uppercount = 0;
		int lowercount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'A' && ch <= 'Z') // BETWEEN UPPERCASE ALPHABET
			{
				uppercount++;
			} else if (ch >= 'a' && ch <= 'z') //// BETWEEN LOWERCASE ALPHABET
			{
				lowercount++;
			}
		}
		System.out.println("the uppercase characters are :" + uppercount);
		System.out.println("the lowercase characters are :" + lowercount);
	}
}
