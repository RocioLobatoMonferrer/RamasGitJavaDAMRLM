package edu.alumno.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Investiga el uso de random y genera por pantalla los números de la lotería
		// primitiva.
		int num1, num2, num3, num4, num5, numExtra;
		Random random = new Random();
		num1 = random.nextInt(49) + 1;
		num2 = random.nextInt(49) + 1;
		num3 = random.nextInt(49) + 1;
		num4 = random.nextInt(49) + 1;
		num5 = random.nextInt(49) + 1;
		numExtra = random.nextInt(49) + 1;

		System.out.println("Números de la Lotería Primitiva:");
		System.out.printf("1:%d, 2:%d, 3:%d, 4:%d, 5:%d\n", num1, num2, num3, num4, num5);
		// Genera 5 números principales

		// Número complementario
		System.out.println("Número Complementario:");
		System.out.println(numExtra);

		System.out.println("¡Buena suerte en el sorteo!");
	}
}