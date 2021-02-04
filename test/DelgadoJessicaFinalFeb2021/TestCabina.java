package DelgadoJessicaFinalFeb2021;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCabina {

	@Test
	public void queVerificaQueCuenteCorrectamenteLaCantidadDeVehiculosQuePaSanPorUnacabina() {
		EstacionDePeaje est= new EstacionDePeaje();
		Cabina  cabina=new Cabina(1);
		Vehiculo v1= new Moto("ACS124");
		Vehiculo v2= new Coche("AXS124");
		est.agregarCabinas(cabina);
assertEquals(2, cabina.getContadorDeVehiculos());
	}


	@Test
	public void queVerificaQueSeRecaudeCorrectaMenteElPagoDeUnVehiculo() {
		Cabina  cabina=new Cabina(1);
		Vehiculo v1= new Moto("ACS124");
		
	}

	
}
