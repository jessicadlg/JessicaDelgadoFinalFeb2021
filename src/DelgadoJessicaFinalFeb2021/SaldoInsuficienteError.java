package DelgadoJessicaFinalFeb2021;

public class SaldoInsuficienteError extends Exception {
	public  SaldoInsuficienteError () {
		super("No es suficiente su saldo");
	}
}
