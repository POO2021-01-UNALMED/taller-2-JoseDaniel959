package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	 int registro;
	
	
	public void cambiarRegistro(int nuevoRegistro) {
		this.registro = nuevoRegistro;
		
		}


	public void asignarTipo(String nuevoMotor) {
		if(nuevoMotor.equals("electrico")) {
			this.tipo = "electrico";
			
		}
		else if(nuevoMotor.equals("gasolina")) {
			this.tipo = "gasolina";
			
		}
		
	}

}
