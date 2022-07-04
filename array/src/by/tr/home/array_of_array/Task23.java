package by.tr.home.array_of_array;

/*Сформировать квадратную матрицу порядка N по правилу
 * и подсчитать количество положительных элементов в ней*/

public class Task23 {

	public static void main(String[] args) {

		int n = 4;
		int count = 0;

		double[][] mas = new double[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((i * i + j * j) * 1.0 / mas.length);
				if (mas[i][j] > 0) {
					count++;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] >= 0) {
					System.out.printf("[ %.2f] ", mas[i][j]);
				} else {
					System.out.printf("[%.2f] ", mas[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println("Count of positive elements: " + count);

	}

}
