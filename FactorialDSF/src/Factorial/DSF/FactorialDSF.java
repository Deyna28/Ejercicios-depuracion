package Factorial.DSF;

import java.util.Scanner;

public class FactorialDSF {
	 Scanner scanner = new Scanner(System.in);

	 System.out.print("Introduce un número para calcular su factorial: ");
	 int number = scanner.nextInt();

	 if (number < 0) {
	     System.out.println("El factorial no está definido para números negativos.");
	 } else {
	     long factorial = 1;
	     for (int i = 1; i <= number; i++) {
	         factorial *= i; // Multiplica acumulativamente
	         System.out.println("El factorial de " + i + " es: " + factorial);

}}}}
