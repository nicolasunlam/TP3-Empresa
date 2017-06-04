package ar.edu.unlam.pb2.empresa;

public class ServicioImpuesto {

	private final double SUELDO_GERENTE=20000.0;
	private final double SUELDO_INGENIERO=15000.0;
	private final double SUELDO_SECRETARIA=10000.0;
	private final double SALARIO_EXTRA_VEHICULO=5000.0;
	
	public double obtenerImpuestos(Empleado miEmpleado){
		if(miEmpleado.getSalario()==SUELDO_GERENTE){
			double salarioConImpuesto = miEmpleado.getSalario()+SALARIO_EXTRA_VEHICULO;
			return salarioConImpuesto;
		}else if(miEmpleado.getSalario()==SUELDO_INGENIERO){
			return this.SUELDO_INGENIERO;
		}else if(miEmpleado.getSalario()==SUELDO_SECRETARIA){
			return this.SUELDO_SECRETARIA;
		}else{
			return 0.0;
		}
		
	}
}

