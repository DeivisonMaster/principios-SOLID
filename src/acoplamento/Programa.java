package acoplamento;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		// AÇÕES
		EnviadorDeEmail email = new EnviadorDeEmail();
		NotaFiscalDao dao = new NotaFiscalDao();
		NotaFiscal nf = new NotaFiscal(250, 30);
		
		email.executa(nf);
		dao.executa(nf);
		
		List<AcaoAposGerarNota> acoes = new ArrayList<AcaoAposGerarNota>();
		acoes.add(email);
		acoes.add(dao);
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
		
		Fatura fatura = new Fatura();
		gerador.gera(fatura);
	}
}
