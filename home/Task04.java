package by.training.simplestapp.home;

import java.util.Scanner;

/* Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class Task04 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double min;
		double max;
		double sum;

		System.out.println("Введите значение a");

		a = getValue();

		System.out.println("Введите значение b");

		b = getValue();

		System.out.println("Введите значение c");

		c = getValue();

		min = Math.min(Math.min(a, b), c);

		max = Math.max(Math.max(a, b), c);

		sum = min + max;

		System.out.println("Сумма максимального и минимального значений равна: " + sum);

	}

	private static double getValue() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextDouble()) {
			scanner.nextLine();
			System.out.println("Введено некорректное значение. Введите значени еще раз");
		}
		return scanner.nextDouble();
	}

}
