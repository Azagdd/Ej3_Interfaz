package persona;

import java.time.LocalDate;

public class Persona {

	private String DNI;
	private String Nombre;
	private String Apellidos;
	private LocalDate FechaNacimiento;
	
	
	public Persona() {
		this.DNI = " ";
		this.Nombre = " ";
		this.Apellidos = " ";
		this.FechaNacimiento = LocalDate.now();
		
	}
		
	public Persona(String dni, String nombre, String apellidos, int dia, int mes, int año) {
		this.DNI=dni;
		this.Nombre=nombre;
		this.Apellidos=apellidos;
		this.FechaNacimiento=LocalDate.of(dia, mes, año);
		
		
		//getters y setters
		
		
		
		//fecha=LocalDate.al(año.mes.dia);
	
	}
}