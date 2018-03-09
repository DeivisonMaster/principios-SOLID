package heranca.composicao;

public class ContaDeEstudante{
	private int milhas;
	private ManipuladorDeSaldo manipulador;
	
	
	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		this.milhas += (int) valor;
	}
	
	public int getMilhas() {
		return milhas;
	}
	
}
