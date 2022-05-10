import java.util.Scanner;

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