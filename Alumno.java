package practica2;

public class Alumno {

	public static void main(String[] args) {
		
		Estudiante alumno1 = new Estudiante("Cesar",1273328,"POO",85);
		Estudiante alumno2 = new Estudiante("Carlos",1276598,"Algebra",100);
		Estudiante alumno3 = new Estudiante("Alejandro",1274854,"Administracion",95);
		Estudiante alumno4 = new Estudiante("Daniel",1274895,"Mercadotecnia",50);
		Estudiante alumno5 = new Estudiante("Nestor",1273214,"Calculo",60);
		
		System.out.println("\n\tDatos del Alumno 6");
		Estudiante alumno6 = new Estudiante(CapturaEntrada.capturaNombre(),CapturaEntrada.capturaID(),CapturaEntrada.capturaMateria(),CapturaEntrada.capturaCalificacion());
		
		System.out.println("\n\tDatos del Alumno 7");
		Estudiante alumno7 = new Estudiante(CapturaEntrada.capturaNombre(),CapturaEntrada.capturaID(),CapturaEntrada.capturaMateria(),CapturaEntrada.capturaCalificacion());
		
		System.out.println("\n\tDatos del Alumno 8");
		Estudiante alumno8 = new Estudiante(CapturaEntrada.capturaNombre(),CapturaEntrada.capturaID(),CapturaEntrada.capturaMateria(),CapturaEntrada.capturaCalificacion());
		
		System.out.println("\n\tDatos del Alumno 9");
		Estudiante alumno9 = new Estudiante(CapturaEntrada.capturaNombre(),CapturaEntrada.capturaID(),CapturaEntrada.capturaMateria(),CapturaEntrada.capturaCalificacion());
		
		System.out.println("\n\tDatos del Alumno 10");
		Estudiante alumno10 = new Estudiante(CapturaEntrada.capturaNombre(),CapturaEntrada.capturaID(),CapturaEntrada.capturaMateria(),CapturaEntrada.capturaCalificacion());
		
		
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		System.out.println(alumno4.toString());
		System.out.println(alumno5.toString());
		System.out.println(alumno6.toString());
		System.out.println(alumno7.toString());
		System.out.println(alumno8.toString());
		System.out.println(alumno9.toString());
		System.out.println(alumno10.toString());	
	}
}
