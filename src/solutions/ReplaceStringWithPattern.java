package solutions;

public class ReplaceStringWithPattern {

	public static void main(String[] args) {
		System.out.println(replaceString("Iamalex"));

	}

	/*
	 * replace empty spaces in string with %20
	 * 
	 */
	public static String replaceStringWithPattern(String str) {
		int c = 0;
		for (char x : str.toCharArray()) {
			if (x == ' ') c++;
				
		}
	
		char[] result = new char[str.length() + 2 * c];
		int m = 0;
		for(char x : str.toCharArray()) {
			if(x != ' ') {
				result[m++] = x;
			}else {
				result[m++] = '%';
				result[m++] = '2';
				result[m++] = '0';
			}
		}
		return new String(result);
	}
	public static String replaceString(String str) {
		return str.replaceAll(" ", "%20");
	}

}
