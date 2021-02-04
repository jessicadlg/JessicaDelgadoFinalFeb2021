package DelgadoJessicaFinalFeb2021;

import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class EstacionPeajeTest {

	
	@Test
	public void queQueObtieneListaDeCabinasOrdenaPorImporteDescendente () {
		EstacionDePeaje est= new EstacionDePeaje();
		Cabina  cabina=new Cabina(1);
		Cabina  cabina2=new Cabina(2);
		Cabina  cabina3=new Cabina(3);
		
		est.agregarCabinas(cabina);
		est.agregarCabinas(cabina2);
		est.agregarCabinas(cabina3);

		OrdenDescendente orden= new OrdenDescendente();
		Set<Cabina>ListaDescendenteEsperada=new TreeSet<Cabina>(orden);
		ListaDescendenteEsperada.add(cabina);
		ListaDescendenteEsperada.add(cabina2);
		ListaDescendenteEsperada.add(cabina3);

		Set<Cabina>ListaDescendente= est.otenerCabinasOrdenadaImporteDescendente(orden);		
		assertEquals(ListaDescendenteEsperada,ListaDescendente );
	}
	
	
	
	
	
}
