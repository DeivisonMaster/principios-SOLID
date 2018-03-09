package ocp.dip;

public class Programa {
	public static void main(String[] args) {
		
		TabelaDePreco tabela = new TabelaDePrecoDiferenciada();
		ServicoDeEntrega entrega = new Frete();
		CalculadoraDePrecos calc = new CalculadoraDePrecos(tabela, entrega);
		
	}
}
