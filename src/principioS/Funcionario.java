package principioS;

import java.util.Calendar;

public class Funcionario {
	private int	id;
	private String nome;
	private Calendar dataAdmissao;
	private double salarioBase;
	private Cargo cargo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public double calculaSalario() {
		return cargo.getRegra().calcula(this);
	}
	
	
}
