package solutions;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseStrRecursive("aleksandar"));

	}

	public static String reverseString(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return new String(arr);
	}

	public static String reverseStr(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	//recursive
	public static String reverseStrRecursive(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			return str.charAt(str.length() - 1) + reverseStr(str.substring(0, str.length() - 1));
		}
	}

}
