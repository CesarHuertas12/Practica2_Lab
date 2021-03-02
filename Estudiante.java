package practica2;

public class Estudiante {
	String nombre, estado, materia;
	int id,calificacion;
	
	public Estudiante(String n, int i, String m, int cali) {
		nombre = n;
		materia = m;
		id = i;
		calificacion = cali;
		
		if(calificacion >= 60) {
			estado = "Aprobado";
		}
		else {
			estado = "Reprobado";
		}
	}
	
	public String toString() {
		return "Datos Alumno [Nombre: " + nombre +", ID: " + id + ", Materia: " + materia + ", Calificacion: " + calificacion + ", Estado: " + estado + "]";
	} 
}
