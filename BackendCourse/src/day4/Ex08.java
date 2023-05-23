package day4;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{12,25,-22},{13,-12,3},{3,-9,74}};
		int[][] triangularMatrix1 = new int[3][3];
		int[][] triangularMatrix2 = new int[3][3];
		
		int counter = -1;
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(j <= counter) {
					triangularMatrix1[i][j] = 0;
				} else {
					triangularMatrix1[i][j] = matrix[i][j];
				}
				System.out.print(triangularMatrix1[i][j] + " ");
			}
			counter++;
			System.out.println();
		}
		
		System.out.println("---------");
		
		counter = 0;
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(j <= counter) {
					triangularMatrix2[i][j] = matrix[i][j];
				} else {
					triangularMatrix2[i][j] = 0;
				}
				System.out.print(triangularMatrix2[i][j] + " ");
			}
			counter++;
			System.out.println();
		}
	}

}
