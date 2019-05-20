package solutions;

public class UniqueString {

	public static void main(String[] args) {
		System.out.println(uniqueString("mama"));

	}

	public static String uniqueString(String input) {
		StringBuilder sb = new StringBuilder();
		for (char x : input.toCharArray()) {
			if (!sb.toString().contains("" + x)) 
				sb.append(x);
		}
		return sb.toString();
	}

}
