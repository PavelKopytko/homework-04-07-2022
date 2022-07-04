package by.tr.home.array_of_array;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

public class Task13 {

	public static void main(String[] args) {

		int n = 6;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = j + 1;
				} else {
					mas[i][j] = mas[i].length - j;
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
