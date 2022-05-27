import java.util.ArrayList;


/*

Continuando o exercício anterior, forneça o método Mensuravel maior(Measuravel[] objs). Use-o para encontrar o nome do empregado com o maior salário. Você precisou fazer algum casting, onde, por que?.

R: Apenas adicionei mais metodos a interface
*/
public class Adicional {
	double media(Mensuravel[] lista){
		double somatoria = 0;
		int tamanhoArray = lista.length;
		for(int i = 0; i < tamanhoArray; i++){
			somatoria += lista[i].getMedida();
		}
		return somatoria / tamanhoArray;	
	}

	String maior(Mensuravel[] lista){
		double maior = lista[0].getSalario();
		String nome = lista[0].getNome();
		for(Mensuravel m: lista){
			if( maior < m.getSalario()){
				maior = m.getSalario();
				nome = m.getNome();
			}
		}
		return nome;
	}

}
