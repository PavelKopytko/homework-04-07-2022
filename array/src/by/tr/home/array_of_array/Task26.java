package by.tr.home.array_of_array;

import java.util.Scanner;

/*С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с 
 * массивом следующие действия:
а) вычислить сумму отрицательных элементов в каждой строке;
б) определить максимальный элемент в каждой строке;
в) переставить местами максимальный и минимальный элементы матрицы*/

public class Task26 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n;
		int m;

		n = 2;
		m = 5;

		int[][] mas = new int[n][m];

		System.out.println(">");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				while (!sc.hasNextInt()) {
					sc.nextLine();
					System.out.println(">");
				}
				mas[i][j] = sc.nextInt();
			}
		}

		System.out.println("Array");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%2d ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			for (int j = 0; j < mas[i].length; j++) {
				sum += mas[i][j];
			}
			System.out.printf("sum %d string =  %2d ", i, sum);
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			int max = mas[i][0];
			for (int j = 0; j < mas[i].length; j++) {
				if (max < mas[i][j]) {
					max = mas[i][j];
				}
			}
			System.out.printf("max %d string =  %2d ", i, max);
			System.out.println();
		}

		int max = mas[0][0];
		int iMax = 0;
		int jMax = 0;
		int min = mas[0][0];
		int iMin = 0;
		int jMin = 0;
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				if (max < mas[i][j]) {
					max = mas[i][j];
					iMax = i;
					jMax = j;
				}
				if (min > mas[i][j]) {
					min = mas[i][j];
					iMin = i;
					jMin = j;
				}
			}
		}

		int temp = min;

		mas[iMin][jMin] = mas[iMax][jMax];
		mas[iMax][jMax] = temp;

		System.out.println("\nReplace min and max");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%2d ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
