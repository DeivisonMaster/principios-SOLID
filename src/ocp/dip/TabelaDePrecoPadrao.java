package ocp.dip;

public class TabelaDePrecoPadrao implements TabelaDePreco {

	/* Classe de teste: A coesão poderia ser afetada já que a regra poderia mudar */
	public double descontoPara(double valor) {
		if(valor > 1000) return 0.05;
		if(valor > 5000) return 0.03;
		
		return 0;
	}

}
