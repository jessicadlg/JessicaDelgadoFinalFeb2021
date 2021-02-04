package DelgadoJessicaFinalFeb2021;

public class AutoBus extends Vehiculo{

	
	
	private Tag tag;
	
	public AutoBus(String patente, Tag tag) {
		super(patente);
		this.tag=tag;
		
	}

	
	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String getTipo() {
		
		return "AutoBus";
	}

	
	public void recargarTag(Double montoAAgregar) {
	Double	saldoActual=this.tag.getSaldo();
			saldoActual+=montoAAgregar;
	this.tag.setSaldo(saldoActual);
	}

	
	
		
	
	

}
