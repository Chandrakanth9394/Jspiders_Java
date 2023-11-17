//WAJ PROGRAM TO FIND THE FREQUENCY OF ALL CHARACTER IN A STRING. 
// OR NUMBER OF OCCURECES OF ALL CHARACTERS IN A STRING

package StringPrograms;

public class StringQ16 {
	public static void main(String[] args) {
		String str = "entertainment";
		String check = "";
	for(int j =0;j<str.length();j++)
	{
		int count = 0;
		char a = str.charAt(j);
		if(check.indexOf(a)== -1)
		{
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (a == ch) {
					count++;
				}
			}
			check+=a;
			System.out.println("The " + a + " has " + count + " counts");
		}
	
	}
	}
}
