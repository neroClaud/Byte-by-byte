package solutions;

import java.util.Arrays;

public class Consecutive {

	public static void main(String[] args) {

		System.out.println(consecutive(new int[] { 5, 4, 3, 1}));
	}
	/*
	 * Given an unsorted array, 
	 * find the length of the longest sequence of consecutive numbers in the array.
	 */
	public static int consecutive(int[] array) {
		if (array == null || array.length == 0)
			return -1;
		Arrays.sort(array);
		int max = 1;
		for (int i = 0; i < array.length; i++) {
			int counter = 1, diff = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] - diff++) {
					counter++;
				} else {
					break;
				}
			}
			if (counter > max)
				max = counter;
		}
		return max;

	}

	public int longestSequence(int[] a) {

		if (a == null || a.length == 0)
			return -1;

		Arrays.sort(a);

		int max = 0;
		int currMax = 1;

		int s = 1;
		int e = a.length;

		while (s < e) {
			if (a[s] == a[s - 1] + 1)
				currMax++;
			else {
				max = Math.max(max, currMax);
				currMax = 1;
			}
			s++;
		}
		return Math.max(max, currMax);
	}

}
