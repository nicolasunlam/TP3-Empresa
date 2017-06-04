package ar.edu.unlam.pb2.empresa;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmpresaTests {

	@Test
	public void testDirectorBrindarDetalles() {
		Empleado empleado = new Director("Juan Perez", "24/08/1960", 100000.0, true, 30000.0);

		List<String> detalles = new ArrayList<>();

		String nombre = empleado.getNombre();
		detalles.add(nombre);

		String fecha = empleado.getFecha();
		detalles.add(fecha);

		String salario = empleado.getSalario();
		detalles.add(salario);

		String cochera = ((Director) empleado).getCochera();
		detalles.add(cochera);

		String extra = ((Director) empleado).getExtra();
		detalles.add(extra);

		System.out.println("Detalles de empleado tipo Director:");
		empleado.brindarDetalles(detalles);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------");

	}

	@Test
	public void testGerenteBrindarDetalles() {
		Empleado empleado = new Director("Rodrigo Rodriguez", "24/08/1960", 80000.0, true, 30000.0);

		List<String> detalles = new ArrayList<>();

		String nombre = empleado.getNombre();
		detalles.add(nombre);

		String fecha = empleado.getFecha();
		detalles.add(fecha);

		String salario = empleado.getSalario();
		detalles.add(salario);

		String cochera = ((Gerente) empleado).getCochera();
		detalles.add(cochera);

		System.out.println("Detalles de empleado tipo Gerente:");
		empleado.brindarDetalles(detalles);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------");

	}

	@Test
	public void testIngenieroBrindarDetalles() {
		Empleado empleado = new Empleado("Ing. Salcedo", "24/08/1960", 40000.0);

		List<String> detalles = new ArrayList<>();

		String nombre = empleado.getNombre();
		detalles.add(nombre);

		String fecha = empleado.getFecha();
		detalles.add(fecha);

		String salario = empleado.getSalario();
		detalles.add(salario);

		System.out.println("Detalles de empleado tipo Ingeniero:");
		empleado.brindarDetalles(detalles);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------");

	}

	@Test
	public void testSecretariaBrindarDetalles() {
		Empleado empleado = new Empleado("Maria Del Ferro", "03/04/1990", 20000.0);

		List<String> detalles = new ArrayList<>();

		String nombre = empleado.getNombre();
		detalles.add(nombre);

		String fecha = empleado.getFecha();
		detalles.add(fecha);

		String salario = empleado.getSalario();
		detalles.add(salario);

		System.out.println("Detalles de empleado tipo Secretaria:");
		empleado.brindarDetalles(detalles);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------");

	}

	@Test
	public void testAplicacion() {
		ServicioImpuesto impSvc = new ServicioImpuesto(null);

		Empleado empleado = new Gerente("Jose Canasto", "02/02/1970", 80000.0, true);
		
		Double impuesto=impSvc.obtenerImpuesto(empleado);
		
		
		
		

	}

}
