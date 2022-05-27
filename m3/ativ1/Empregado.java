public class Empregado implements Mensuravel {
	//variaveis de instancia
	private String nome;
	private double salario;
	
	//construtor
	public Empregado(String nome, double salario)
	{
		this.nome = nome;
		this.salario = salario;
	}	
	
	//getters
	public String getNome() { return this.nome; }
	public double getSalario() { return this.salario;}

	public double getMedida() {
		// TODO Auto-generated method stub
		return this.salario;
	}
	
}
