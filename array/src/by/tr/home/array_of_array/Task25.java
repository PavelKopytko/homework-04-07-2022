package by.tr.home.array_of_array;

/*Получить квадратную матрицу порядка n*/

public class Task25 {

	public static void main(String[] args) {

		int n = 6;

		int[][] mas = new int[n][n];
		
		int k = 1;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = k++;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%2d ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
