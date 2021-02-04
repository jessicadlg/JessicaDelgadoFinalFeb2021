package DelgadoJessicaFinalFeb2021;

import java.util.HashMap;

import java.util.Map;

public class Cabina {

	/*
	 * Fornato del Contador de vehiculo ejemplo Clave valor Moto 6 AutoBus 3 Moto 2
	 * 
	 */
	private Map<String, Integer> contadorDeVehiculos;
	private Integer numero;

	/*
	 * 
	 */
	private Double tarifaCoche;
	private Double tarifaMoto;
	private Double tarifaAutoBus;

	/* recaudacion total de todos los vehiculos que pasaron por dicha cabina */
	private Double recaudacion;

	public Cabina(Integer numero) {
		this.numero = numero;
		this.recaudacion = 0.0;
		this.tarifaAutoBus = 200.0;
		this.tarifaCoche = 100.0;
		this.tarifaMoto = 50.0;

		// Completar la inicializacion de los atributos restantes
		this.contadorDeVehiculos = new HashMap<String, Integer>();
		this.contadorDeVehiculos.put("Moto", 0);
		this.contadorDeVehiculos.put("Coche", 0);
		this.contadorDeVehiculos.put("AutoBus", 0);
	}

	/*
	 * Este metodo realiza el cobro y acumula la recaudacion de la cabina en funcion
	 * al tipo de auto Tambien contabiliza la cantidad de vehiculo ejemplo si es
	 * moto aumenta en uno el contador de moto
	 */
	public void pagar(Vehiculo vehiculo) {
		Double precio = 0.0;
		String tipo = vehiculo.getTipo();

		switch (tipo) {
		case "Coche":
			precio = this.tarifaCoche;
			break;
		case "Moto":
			precio = this.tarifaMoto;
			break;

		case "AutoBus":
			precio = this.tarifaAutoBus;
		}

		this.recaudacion += precio;

	}

	/*
	 * incrementa el contadorDeVehiculo
	 */
	private void contarVehiculo(Vehiculo vehiculo) {
		String tipo = vehiculo.getTipo();
		Integer contador=this.contadorDeVehiculos.get(tipo);
		contador++;
		this.contadorDeVehiculos.put(tipo,contador);
	}

	public Map<String, Integer> getContadorDeVehiculos() {
		return contadorDeVehiculos;
	}

	public void setContadorDeVehiculos(Map<String, Integer> contadorDeVehiculos) {
		this.contadorDeVehiculos = contadorDeVehiculos;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getTarifaCoche() {
		return tarifaCoche;
	}

	public void setTarifaCoche(Double tarifaCoche) {
		this.tarifaCoche = tarifaCoche;
	}

	public Double getTarifaMoto() {
		return tarifaMoto;
	}

	public void setTarifaMoto(Double tarifaMoto) {
		this.tarifaMoto = tarifaMoto;
	}

	public Double getTarifaAutoBus() {
		return tarifaAutoBus;
	}

	public void setTarifaAutoBus(Double tarifaAutoBus) {
		this.tarifaAutoBus = tarifaAutoBus;
	}

	public Double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(Double recaudacion) {
		this.recaudacion = recaudacion;
	}

}
