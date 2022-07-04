package by.tr.home.array_of_array;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

public class Task19 {

	public static void main(String[] args) {

		int n = 8;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			if (i < n / 2) {
				for (int j = i; j < mas[i].length - i; j++) {
					mas[i][j] = 1;
				}
			} else {
				for (int j = mas.length - 1 - i; j <= i; j++) {
					mas[i][j] = 1;
				}
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
