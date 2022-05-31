
/*
10 -Faça uma chamada para Arrays.sort() para ordenar um array de objetos funcionários, tal como definidos no exercício um, com base no salário, em caso de salários iguais a ordenação deve ser por nome, em ordem alfabética.
*/


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
		for(Mensuravel item: o.bubbleSort(lista)){
			System.out.println(item.getMedida());
		}
	}
}
