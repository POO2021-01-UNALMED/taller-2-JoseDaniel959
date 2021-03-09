package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[] ;  
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	
	public int cantidadAsientos() {
		int numeroAsientos = 0;
		for(Asiento i : asientos) {
			if( i != null) {
				numeroAsientos++;
				
			}
			
		}
		return numeroAsientos; 
		
	}
	
	public String verificarIntegridad() {
		
		if( motor != null) {
			if( motor.registro != registro ) {
					return "Las piezas no son originales";
				}
		}
		
		for(Asiento i :asientos) {
			
			if( i!= null) {
				if( i.registro != registro ) {
					return "Las piezas no son originales";
				}
			}
		}	
		
		
		for(Asiento i :asientos) {
			if( i!= null) {
				if( i.registro != motor.registro) {
					return "Las piezas no son originales";

				}
			}	
		}
		
		
		return "Auto original";
	}
	

}
