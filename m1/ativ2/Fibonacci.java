import java.util.Scanner;

/*
AsériedeFibonacciédadapor1,1,2,3,5,8,13,21...FaçaumprogramaquecalculetodososnúmerosdasériedeFibonaccimenoresouiguaisan,ondenéumnúmerointeiro maior que 1, fornecido pelo usuário.
*/
public class Fibonacci {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com um número maior que 1 :");
		int n = leitor.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.printf("(" + i + "):" + Fibonacci.calculator(i) + "\t"); 
		}
	}
	public static int calculator(int valor){
		if(valor < 2){	
			return valor;
		}	
		else{
			return calculator(valor-1) + calculator(valor-2);
		}
	}	
}