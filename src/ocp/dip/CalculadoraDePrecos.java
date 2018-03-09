package ocp.dip;

public class CalculadoraDePrecos {
	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;

	
	/* Depender de interfaces/abstração é mais fácil pois são estáveis em comparação a depender de
	 * uma implementação concreta */
	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto){
		
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());
		
		return produto.getValor() * (1 - desconto) + frete;
	}
}
