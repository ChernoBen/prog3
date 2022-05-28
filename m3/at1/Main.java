import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){	
		Empregado emp1 = new Empregado("Kiko", 2000);
		Empregado emp2 = new Empregado("Zinho", 2500);
		Empregado emp3 = new Empregado("Branco", 3000);
		Empregado emp4 = new Empregado("Lindu", 3000);	
		Mensuravel[] lista = {emp1, emp2, emp3, emp4};
		Adicional o = new Adicional();
		double media = o.media(lista);
		System.out.printf("Media: %.2f", media);
	}
}
