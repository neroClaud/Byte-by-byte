package solutions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sortCharsInString("aleksandar"));
	}

	public static String sortCharsInString(String str) {
		return str.chars().sorted().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining(""));
	}
	public static String sortChars(String str) {
		char [] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
