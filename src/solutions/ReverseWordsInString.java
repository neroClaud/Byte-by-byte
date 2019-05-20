package solutions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWordsInString {

	public static void main(String[] args) {
		System.out.println(reverseWords("Tod i saw a dot"));

	}
	
	public static String reverseWords(String str) {
		String[] arr = str.split(" ");
		return IntStream.rangeClosed(1, arr.length)
						.mapToObj(i -> arr[arr.length - i])
						.collect(Collectors.joining(" "));
		
	}

}
