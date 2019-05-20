package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompresion {

	public static void main(String[] args) {
		System.out.println(stringCompresion("abbaacbre"));

	}
	/*
	 * Given a string, write a function to compress it by shortening every sequence 
	 * of the same character to that character followed by the number of repetitions. 
	 * If the compressed string is longer than the original, you should return the original string.
	 * 
	 * compress(“aaabbb”) = "a3b3"
	 * compress(“aaabccc”) = "a3b1c3"
	 */
	public static String stringCompresion(String str) {
		Map<Character,Integer> result = new HashMap<>();
		for(char x : str.toCharArray()) {
			if(!result.containsKey(x))
				result.put(x,1);
			else
				result.replace(x, result.get(x) + 1);
		}
		StringBuilder sb = new StringBuilder();
		for(Entry<Character,Integer> entry : result.entrySet()) {
			sb.append(entry.getKey()).append(entry.getValue());
		}
		return sb.toString();
	}
}
