package ejercicio.depuracionDSF;
import java.util.*;
public class ej1 {
	/*
	* Programa que lee números hasta que se lee un negativo
	*  y muestra la suma de los números leídos
	*/
	 public static void main(String[] args) {
	 int suma = 0, num;
	 int contador=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Introduzca un número: ");
	 num = sc.nextInt();
	 while (num>= 0){
	 suma = suma + num;
	 contador++;
	 System.out.print("Introduzca un número: ");
	 num = sc.nextInt();
	 }
	 System.out.println("La suma es: " + suma );
	 }
	}