package solutions;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(longestSubstringWithoutRepeatingCharacters("abcabcbb"));

	}

	public static String longestSubstringWithoutRepeatingCharacters(String str) {
		int max = 0;
		String retVal = new String();
		for (int i = 0; i < str.length(); i++) {
			StringBuilder sb = new StringBuilder();
			int counter = 0;
			for (int j = i; j < str.length(); j++) {
				if (!sb.toString().contains("" + str.charAt(j))) {
					sb.append(str.charAt(j));
					counter++;
				} else {
					break;
				}
			}
			if (counter > max) {
				retVal = sb.toString();
				max = counter;
			}
		}
		return retVal;
	}

}
