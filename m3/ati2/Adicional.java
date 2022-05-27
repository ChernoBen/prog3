import java.util.ArrayList;

public class Adicional{
	double media(Mensuravel[] lista){
		double somatoria = 0;
		int tamanhoArray = lista.length;
		for(int i = 0; i < tamanhoArray; i++){
			somatoria += lista[i].getMedida();
		}
		return somatoria / tamanhoArray;	
	}

	String maior(Mensuravel[] lista){
		String aux ="";
		int tamanho = lista.length;
		double maior = 0.0; 
		for(int i =0; i < tamanho; i++){
			if(maior < lista[i].getSalario()){
				aux = lista[i].getNome();
			}
		}
		return aux;
	}

}
