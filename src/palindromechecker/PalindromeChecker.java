package palindromechecker;

public class PalindromeChecker {
	//Checks to see if a string is a palindrome
	public static void main(String[] args) {
		String text = "Hello World";
		String pal = "racecar";
		System.out.println(isPalindrome(pal));
		System.out.println(isPalindrome(text));
		System.out.println(isPalindrome("abba"));
		System.out.println(isPalindrome("asdfafasfasd"));
	}
	
	private static boolean isPalindrome(String string) {
		if(string.length() == 1) {
			return true;
		}
		for(int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		
		return true;
	}
}
