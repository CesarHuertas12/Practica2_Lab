package practica2;

import java.util.Scanner;

public class CapturaEntrada {
	
	public static String capturaNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el nombre: ");
		return sc.nextLine();
	}
	
	public static String capturaMateria() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el nombre de la materia: ");
		return sc.nextLine();
	}
	
	public static int capturaID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa tu ID: ");
		return sc.nextInt();
	}
	
	public static int capturaCalificacion() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa la calificacion: ");
		return sc.nextInt();
	}
}
