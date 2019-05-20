package solutions;

import java.util.Arrays;

public class ZeroMatrix {

	public static void main(String[] args) {
		boolean mat[][] = new boolean[3][3];
		//mat[2][0] = true;
		
		boolean matrix[][] = zeroMatrix(mat);
		for(int i = 0;i < matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	/*
	 *Given a boolean matrix, update it so that if any cell is true,
	 * all the cells in that row and column are true.                              
	 */
	
	public static boolean[][] zeroMatrix(boolean[][] matrix) {
		int x = -1, y = -1;
		boolean retVal[][] = new boolean[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]) {
					x = i;
					y = j;
				}
			}
			retVal[i] = matrix[i];
		}
		if(x == -1 || y == -1) return null;
		
		for (int i = 0; i < retVal.length; i++) {
			for (int j = 0; j < retVal[i].length; j++) {
				if (i == x || j == y) {
					retVal[i][j] = true;
				}
			}
		}
		return retVal;
	}
}
