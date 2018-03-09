package encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {
	private double valor;
	private List<Pagamento> pagamentos;
	private String cliente;
	private boolean pago;
	
	
	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public List<Pagamento> getPagamentos() {
		return Collections.unmodifiableList(pagamentos);
	}
	
	public double getValor() {
		return valor;
	}
	
	public boolean isPago() {
		return pago;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		
		if(valorTotalDosPagamentos() > this.valor){
			this.pago = true;
		}
	}

	private double valorTotalDosPagamentos() {
		double total = 0;
		for (Pagamento pagamento : pagamentos) {
			total += pagamento.getValor();
		}
		
		return total;
	}
	
}
