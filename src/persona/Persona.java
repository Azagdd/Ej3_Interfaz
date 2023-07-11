package persona;

import java.time.LocalDate;

/**
 * @author Juan Jesus
 *
 */
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
		
	}
		
		//getters y setters
		
		public String getdni() {
			return this.DNI;
			
		}
		
		public String getnombre() {
			return this.Nombre;
			
		}
		
		public String getapellidos() {
			return this.Apellidos;
			
		}
			
		public LocalDate getFecha() {
			return this.FechaNacimiento;
		
		}
		
		public void setdni(String dni) {
			this.DNI = dni;
			
		}
		
		public void setapellidos(String apellidos) {
			this.DNI = apellidos;
			
		}
		
		public void setnombre(String nombre) {
			this.Nombre = nombre;
			
		}
		
		public void setfecha(LocalDate fecha) {
			this.FechaNacimiento = fecha;
		
		}

		@Override
		public String toString() {
			return "Persona [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", FechaNacimiento="
					+ FechaNacimiento + "]";
		}
		
		//fecha=LocalDate.al(año.mes.dia);
	
	}
