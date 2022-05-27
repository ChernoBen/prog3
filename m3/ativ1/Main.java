import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		//criar lista de Empregados
		//ArrayList<Empregados> lista = new ArrayList<>();
		
		Empregado emp1 = new Empregado("harison", 2000);
		Empregado emp2 = new Empregado("gabriele", 2500);
		Empregado emp3 = new Empregado("ricardo", 3000);
		
		Mensuravel[] lista = {emp1, emp2, emp3};
		
		
	/*	Scanner leitor = new Scanner(System.in);
		
		String nome = "";
		double salario; */
		
	/*	while(true)
		{
			System.out.println("Entre com o nome do funcionario ou fim para sair:");
			nome = leitor.nextLine();
			if(nome.equalsIgnoreCase("fim"))
			{
				break;
			}
			System.out.println("Entre com o salario:");
			salario = Double.parseDouble(leitor.nextLine());
			lista.add(new Empregado(nome, salario));
		} */
		
		/*for(Empregado f: lista)
		{
			System.out.printf("Nome: %s, Salario: %.2f ", f.getNome(), f.getSalario());
		} */
		
		Adicional o = new Adicional();
		double medValor = o.media(lista);
		System.out.printf("Resultado: %.2f", medValor);
	}
}
