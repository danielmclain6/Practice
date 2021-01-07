package lastwordlength;

public class LengthOfLastWord {

	//Check for the length of the last word in a string
	public static void main(String[] args) {
	String text = "Hello World";
	String oneWord = "Hello";
	System.out.println(lastWordLength(text));
	System.out.println(lastWordLength(oneWord));
	System.out.println(lastWordLength("The last word has a length of four"));
	}
	
	private static int lastWordLength(String string) {
		if(string.indexOf(" ") == -1) {
			return string.length();
		}
		int lastSpace = 0;
		while(lastSpace != -1) {
			lastSpace = string.indexOf(" ");
			string = string.substring(lastSpace + 1);
		}
		return string.length();
	}
	
	
}
