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

}
