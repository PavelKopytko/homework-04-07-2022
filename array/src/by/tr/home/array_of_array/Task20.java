package by.tr.home.array_of_array;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

public class Task20 {

	public static void main(String[] args) {

		int n = 8;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = 1;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			if (i < n / 2) {
				for (int j = i + 1; j < mas[i].length - i - 1; j++) {
					mas[i][j] = 0;
				}
			} else {
				for (int j = mas.length - i; j < i; j++) {
					mas[i][j] = 0;
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
