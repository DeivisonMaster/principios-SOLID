package heranca.composicao;

public class ContaComum {
	private ManipuladorDeSaldo manipulador;
	
	
	public ContaComum() {
		this.manipulador = new ManipuladorDeSaldo();
	}
	
	public void saca(double valor){
		this.manipulador.saca(valor);
	}
	
	public void deposita(double valor){
		this.manipulador.deposita(valor);
	}
	
	public void rende(){
		this.manipulador.rende(1.1);
	}
	
}
