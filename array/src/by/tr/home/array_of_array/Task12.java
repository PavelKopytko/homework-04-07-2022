package by.tr.home.array_of_array;

/*Получить квадратную матрицу порядка n*/

public class Task12 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = i;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
