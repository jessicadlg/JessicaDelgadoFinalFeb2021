package DelgadoJessicaFinalFeb2021;



public abstract class Vehiculo {
	
	
	private String Patente;
	public Vehiculo(String patente) {
		
		Patente = patente;
	}
	

	public abstract String getTipo();

	

}
