package encapsulamento;

public class Pagamento {
	private double valor;
	private MeioDePagamento forma;

	public Pagamento(double valor, MeioDePagamento forma) {
		this.valor = valor;
		this.forma = forma;
	}
	
	public double getValor() {
		return valor;
	}

}
