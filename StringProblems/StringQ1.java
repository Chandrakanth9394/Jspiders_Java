//WAJP TO COUNT THE LENGTH OF A STRING WITHOUT USING LENGTH().

package StringPrograms;

public class StringQ1 {
	public static void main(String[] args) {
		String name = "Chandrakanth";
//		int a = name.length();
//		System.out.println(a);
		char ch[]=name.toCharArray();
		int count = 0;
		for (char c : ch) {
			count++;
		}
		System.out.println("the length of name is: " + count);
	}
}

