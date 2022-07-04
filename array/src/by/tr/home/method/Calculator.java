package by.tr.home.method;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double x, y;
		double sum, substraction, multiplication, division;

		x = inputDoubleFromConsole("Введите первое значение: ");
		y = inputDoubleFromConsole("Введите второе значение: ");

		sum = addition(x, y);
		substraction = subtraction(x, y);
		multiplication = multiplication(x, y);
		division = division(x, y);

		simplePrint(x, y, sum, '+');
		richPrint(x, y, sum, '+');

		simplePrint(x, y, substraction, '-');
		richPrint(x, y, substraction, '-');

		simplePrint(x, y, multiplication, '*');
		richPrint(x, y, multiplication, '*');

		simplePrint(x, y, division, '/');
		richPrint(x, y, division, '/');

	}

	public static double inputDoubleFromConsole(String message) {
		double value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		value = sc.nextDouble();
		return value;
	}

	public static double addition(double a, double b) {
		double sum;
		sum = a + b;
		return sum;
	}

	public static double subtraction(double a, double b) {
		return a - b;
	}

	public static double multiplication(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		return a / b;
	}

	public static void simplePrint(double a, double b, double rez, char sign) {
		System.out.println(a + " " + sign + " " + b + " = " + rez);
	}

	public static void richPrint(double a, double b, double rez, char sign) {
		System.out.printf("[%.2f] %c [%.2f] = [%.2f]", a, sign, b, rez);
		System.out.println();
	}

}
