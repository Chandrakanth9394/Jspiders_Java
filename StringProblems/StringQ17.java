//write a java program to print duplicate characters in String
//step 1: find the each character occurances.
//step 2: find the all characters occurances.
//step 3: check the condition.
package StringPrograms;

public class StringQ17 {
	public static void main(String[] args) {
		String str = "entertainment";
		String check = "";
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (check.indexOf(ch) == -1) {
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					char a = str.charAt(j);
					if (a == ch) {
						count++;
					}

				}
				if (count >= 2) {
					System.out.println(ch + " " + count);
				}
				check += ch;

			}
		}
	}
}

