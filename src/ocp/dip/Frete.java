package ocp.dip;

public class Frete implements ServicoDeEntrega{

	/* Classe de teste: A coes�o poderia ser afetada j� que a regra poderia mudar */
	public double para(String cidade) {
		if("SAO PAULO".equals(cidade.toUpperCase())){
			return 15;
		}
		return 30;
	}

}
