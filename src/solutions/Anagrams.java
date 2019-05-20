package solutions;

public class Anagrams {

	public static void main(String[] args) {
		System.out.println(isAnagram("abab", "BabA"));

	}
	/*
	 * Given two strings, write a function to determine whether they are anagrams.
	 */
	// my solution
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length() != s2.length()) 
			return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		for(char c : s2.toCharArray()) {
			if(s1.contains(String.valueOf(c)))
				s1 = s1.replaceFirst(String.valueOf(c), "");
			else
				return false;
			
		}
		return s1.isEmpty();
	}
	//bytebybyte solution
	public static boolean isAnagramByteByByte(String s1,String s2) {
		if(s1.length() != s2.length()) return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int[] letters = new int[1<<8];
		
		for(char c : s1.toCharArray()) {
			letters[c]++;
		}
		for(char c : s2.toCharArray()) {
			letters[c]--;
		}
		
		for(int i : letters) {
			if(i != 0) return false;
		}
		return true;
	}

}
