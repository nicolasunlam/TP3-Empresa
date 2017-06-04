package ar.edu.unlam.pb2.empresa;


public class Empleado {
	private String nombre;
	private String fecha;
	private Double salario;

	public Empleado(String nombre, String fecha, Double salario) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String brindarDetalles(){
		return "Empleado [nombre=" + nombre + ", salario=" + salario
				+ ", fechaDeNacimiento=" + fecha + "]";
	}


}
