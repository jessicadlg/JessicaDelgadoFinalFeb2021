package DelgadoJessicaFinalFeb2021;

import java.util.Comparator;

public class OrdenDescendente implements Comparator<Cabina> {

	@Override
	public int compare(Cabina o1, Cabina o2) {
		return o1.getRecaudacion().compareTo(o2.getRecaudacion());
	}

}
