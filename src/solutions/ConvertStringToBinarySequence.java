package solutions;

import java.util.stream.Collectors;

public class ConvertStringToBinarySequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertStringToBin("GFG"));

	}

	/*
	 * Input : GFG Output : 1000111 1000110 1000111
	 */
	public static String convertStringToBinary(String str) {
		return str.chars().mapToObj(x -> Integer.toBinaryString(x)).collect(Collectors.joining(" "));

	}

	public static String convertStringToBin(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			String num = Integer.toBinaryString(str.charAt(i));
			sb.append(i != 0 ? " " + num : num);
		}
		return sb.toString();
	}

}
