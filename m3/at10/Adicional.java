import java.util.ArrayList;

public class Adicional{
	double media(Mensuravel[] lista)
	{
		double somatoria = 0;
		int tamanhoArray = lista.length;
		for(int i = 0; i < tamanhoArray; i++){
			somatoria += lista[i].getMedida();
		}
		return somatoria / tamanhoArray;	
	}
	Mensuravel[] bubbleSort(Mensuravel[] lista){
		for(int i = 0; i < lista.length - 1; i++) {
			for(int j = 0; j < lista.length - 1 - i; j++){
			  if(lista[j].getMedida() > lista[j + 1].getMedida()){
				Mensuravel aux = lista[j];
				lista[j] = lista[j + 1];
				lista[j + 1] = aux;
			  }
			}
		}
		return lista;
	}

}
