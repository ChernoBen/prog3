public class Empregado implements Mensuravel {
	private String nome;
	private double salario;
	public Empregado(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}	
	public String getNome() { return this.nome; }
	public double getSalario() { return this.salario;}

	public double getMedida() {
		return this.salario;
	}
	
}
