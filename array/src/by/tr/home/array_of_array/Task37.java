package by.tr.home.array_of_array;

import java.util.Random;

/*Переставить строки матрицы случайным образом*/

public class Task37 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(9) + 1;
		int m = rand.nextInt(12) + 1;

		int[][] mas = new int[n][m];

		int[] indexArray = new int[mas.length];

		mas = filling(mas, rand);

		print(mas);

		indexArray = getNewIndex(indexArray, mas, rand);

		mas = sort(mas, indexArray);

		System.out.println("Sorted array");

		print(mas);

	}

	private static int[][] sort(int[][] array, int[] indexArray) {

		int[][] ar = new int[array.length][array[0].length];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = array[indexArray[i]];
		}
		return ar;
	}

	private static int[][] filling(int[][] mas, Random rand) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}
		return mas;
	}

	private static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%d} ", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

	private static int[] getNewIndex(int[] indexArray, int[][] mas, Random rand) {

		for (int i = 0; i < indexArray.length; i++) {
			int k = 0;
			boolean flag = false;

			while (!flag) {
				k = rand.nextInt(mas.length);
				flag = true;
				for (int j = 0; j < i; j++) {
					if (k == indexArray[j]) {
						flag = false;
						break;
					}
				}
			}
			indexArray[i] = k;
			System.out.println(indexArray[i]);
		}

		return indexArray;
	}

}
