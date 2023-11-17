//WAJ PROGRAM TO COUNT THE CHARACTER IN STRING.

package StringPrograms;

public class StringQ15 {
public static void main(String[] args) {
	String str = "hello";
	char ch ='y';
	int count=0;
	for(int i =0;i<=str.length()-1;i++)
	{
		if(ch==str.charAt(i))
		{
			count++;
		}
	}
	System.out.println("the element "+ch+" has "+count+ " counts");
}
}
