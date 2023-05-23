package day4;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{12,25,-22},{13,-12,3},{3,-9,74}};
		
		int[][] diagonalMatrix = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					diagonalMatrix[i][j] = matrix[i][j];
				} else {
					diagonalMatrix[i][j] = 0;
				}
				System.out.print(diagonalMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
