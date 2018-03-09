package ocp.dip;

public class CalculadoraDePrecos {
	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;

	
	/* Depender de interfaces/abstra��o � mais f�cil pois s�o est�veis em compara��o a depender de
	 * uma implementa��o concreta */
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
