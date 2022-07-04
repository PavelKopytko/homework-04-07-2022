package by.tr.home.linear_array;

import java.util.Random;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него 
 * каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. 
 * Дополнительный массив не использовать*/

public class Task20 {

	public static void main(String[] args) {

		Random rand = new Random();

		int r = rand.nextInt(20) + 1;

		int[] mas = new int[r];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(25) + 1;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

		for (int i = 1; i < mas.length; i += 2) {
			mas[i] = 0;
		}

		System.out.println("\n");

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}
		if (mas.length % 2 == 0) {
			for (int i = 1; i < mas.length / 2; i++) {
				mas[i] = mas[2 * i];
				mas[2 * i] = 0;
			}
		} else {
			for (int i = 1; i < mas.length / 2; i++) {
				mas[i] = mas[2 * i];
				mas[2 * i] = 0;
			}
			mas[mas.length / 2] = mas[mas.length - 1];
			mas[mas.length - 1] = 0;
		}

		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

	}

}
