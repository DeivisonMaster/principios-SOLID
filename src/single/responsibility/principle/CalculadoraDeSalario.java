package single.responsibility.principle;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario){
		return funcionario.calculaSalario();
	}
}
