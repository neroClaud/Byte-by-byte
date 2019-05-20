package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(findDuplicates(new int[] {3,3,3,2,1,2})));

	}
	/*
	 * Given an array of integers where each value 1 <= x <= len(array),
	 *  write a function that finds all the duplicates in the array.
	 */
	public static int[] findDuplicates(int[] arr) {
		Set<Integer> retVal = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			int c = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					c++;
			}
			if (c > 1)
				retVal.add(arr[i]);
		}
		return retVal.stream().mapToInt(x -> x).toArray();
	}
}
