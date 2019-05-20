package solutions;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalinRecursive("madam"));

	}

	public static boolean isPalindrome(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1])
				return false;
		}
		return true;
	}

	public static boolean isPalin(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	//recursive
	public static boolean isPalinRecursive(String string) {
		if (string.length() < 2) {
			return true;
		} else {
			if (string.charAt(0) != string.charAt(string.length() - 1))
				return false;
			else
				return isPalinRecursive(string.substring(1, string.length() - 1));
		}
	}
}
