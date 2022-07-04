package by.tr.home.array_of_array;

/*Дан линейный массив x1, x2,..., xn−1, xn . Получить действительную квадратную матрицу порядка n*/

public class Task24 {

	public static void main(String[] args) {

		int n = 4;

		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}

		double[][] mas = new double[array.length][array.length];

		for (int i = 1; i <= mas.length; i++) {
			for (int j = 1; j <= mas[i - 1].length; j++) {
				mas[i - 1][j - 1] = Math.pow(array[j - 1], i);
			}
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%2.2f  ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
