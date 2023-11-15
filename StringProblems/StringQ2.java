//WAJP TO COUNT THE NUMBER OF VOWELS IN THE STRING.

package StringPrograms;

public class StringQ2 {
	public static void main(String[] args) {
		String name = "Chandrakanth";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println("the number of vowels in the name is : " + count);
	}
}
