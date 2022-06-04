package by.training.simplestapp.home;

import java.util.Scanner;

/*Для данных областей составить линейную программу, которая печатает true, 
 * если точка с координатами (х,у) принадлежит закрашенной области, и false 
 * - в противном случае*/

public class Task02 {

	public static void main(String[] args) {

		double x;
		double y;
		boolean trueFalse = false;

		System.out.println("Введите значение X");
		x = getValue();

		System.out.println("Введите значение Y");
		y = getValue();

		if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
			trueFalse = true;
		} else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
			trueFalse = true;
		}

		if (trueFalse == true) {
			System.out.println(trueFalse);
			System.out.println("Точка с коорд. " + "(" + x + "," + y + ") находится в закрашенной области");
		} else {
			System.out.println(trueFalse);
			System.out.println("Точка с коорд. " + "(" + x + "," + y + ") не находится в закрашенной области");
		}

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
