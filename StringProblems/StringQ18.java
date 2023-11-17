//write a java program to remove the duplicate character in string

package StringPrograms;

public class StringQ18 {
public static void main(String[] args) {
	String str = "entertainment";
    System.out.println("Original String: " + str);
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (result.indexOf(ch) == -1) {
            result += ch;
        }
    }
    System.out.println("String after removing duplicates: " + result);

}
}

//https://www.w3resource.com/java-exercises/string/index.php