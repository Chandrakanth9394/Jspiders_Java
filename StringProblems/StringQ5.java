////Given a string, the task is to reverse the order of the words in the given string. 

//Input: s = “geeks quiz practice code” 
//Output: s = “code practice quiz geeks”
//
//Input: s = “i love programming very much” 
//Output: s = “much very programming love i” 
package StringPrograms;

public class StringQ5 {
	public static void main(String[] args) {
		String s = "geeks quiz practice code";
		System.out.println(s);
		String str[] = s.split(" ");
		int c = 0;
		String str1[] = new String[str.length];
		for (int i = str.length - 1; i >= 0; i--) {
			str1[c] = str[i];
			c++;

		}
		for (String a : str1) {
			System.out.print(a + " ");
		}
	}
}
