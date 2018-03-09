package ocp.dip;

public class Frete implements ServicoDeEntrega{

	/* Classe de teste: A coesão poderia ser afetada já que a regra poderia mudar */
	public double para(String cidade) {
		if("SAO PAULO".equals(cidade.toUpperCase())){
			return 15;
		}
		return 30;
	}

}
