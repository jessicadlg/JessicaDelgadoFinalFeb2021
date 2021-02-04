package DelgadoJessicaFinalFeb2021;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TelepaseTest {
	
	
	@Test
	public void queVerificaQueSeEncuentreElTagConIdUno () {
		//Para este test se debeinvocar al metodo public Boolean verifcarExiste(Tag tag)
		//el mismo no se puede modificar
//		Cabina  cabina=new Cabina(1);
//		Telepase telepase= new Telepase(1);
//		telepase.cargarTag(200);
//		telepase.verifcarExiste(1);

		
	}
	

	@Test
	public void queAlPasarAutobusconSaldoInsuficienteLanceUnaExcepcion () {
		Cabina  cabina=new Cabina(1);
		Tag tag=new Tag(1);
		Vehiculo v2= new AutoBus("AXS124",tag);
		

	}
	
	@Test
	public void queAlPasarUnAutobusconUnTagInvalidoLanceUnaExcepcion () {
		Cabina  cabina=new Cabina(1);
		Tag tag=new Tag(2);
		Vehiculo v2= new AutoBus("AXS124",tag);
		
	}
	
	

}
