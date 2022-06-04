package by.training.simplestapp.home;

import java.util.Scanner;

/*Вычислитть периметр и площадь прямоугольного треугольника по 
 * длинам a и b двух катетов*/

public class Task01 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double perimeter;
		double square;

		System.out.println("Введите величину первого катета");
		a = getValue();

		System.out.println("Введите величину второго катета");
		b = getValue();

		c = Math.sqrt(a * a + b * b);

		perimeter = a + b + c;

		square = a * b / 2;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c =" + c);

		System.out.printf("\nПериметр треугольника равен %.2f", perimeter);
		System.out.printf("\nПлощадь треугольника равна %.2f", square);

	}

	private static double getValue() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введено некорректное значение. Введите значени еще раз");
		}
		return sc.nextDouble();
	}

}
