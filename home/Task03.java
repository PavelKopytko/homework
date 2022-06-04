package by.training.simplestapp.home;

import java.util.Scanner;

/*Даны три действительных числа. Возвести в квадрат те из них, значения которых 
 * неотрицательны, и в четвертую степень — отрицательные.*/

public class Task03 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		double resultA;
		double resultB;
		double resultC;

		System.out.println("Введите значение a");
		
		a = getValue();
		
		System.out.println("Введите значение b");
		
		b = getValue();
		
		System.out.println("Введите значение c");
		
		c = getValue();

		resultA = getResult(a);
		resultB = getResult(b);
		resultC = getResult(c);

		System.out.println("a = " + a + ", результат = " + resultA);
		System.out.println("b = " + b + ", результат = " + resultB);
		System.out.println("c = " + c + ", результат = " + resultC);

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

	private static double getResult(double a) {
		double result;
		if (a >= 0) {
			result = Math.pow(a, 2);
		} else {
			result = Math.pow(a, 4);
		}
		return result;
	}

}
