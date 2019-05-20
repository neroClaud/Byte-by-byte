package solutions;

import java.util.Arrays;

public class ZeroSum {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(zeroSum(new int[] { 1, 12, 2, -5, 1, 2 })));
	}
	/*
	 * Given an array, write a function to find any subarray that sums to zero, if one exists.
	 */
	public static int[] zeroSum(int[] array) {

		for (int i = 0, j; i < array.length; i++) {
			int sum = 0;
			for (j = i; j < array.length; j++) {
				sum += array[j];
				if (sum == 0 && j - i != array.length - 1)
					return Arrays.copyOfRange(array, i, j + 1);
			}

		}
		return null;
	}

}
