import java.util.*;
/*
Escrevaumprogramaqueimprimaumacombinaçãodeloteria,escolhendoseisnúmerosdiferenteentre1e60.Paraescolherseisnúmerosdistintos,comececomumArrayListpreenchidocom1...60.Escolhaumíndicealeatórioeremovaoelemento. Repita o processo seis vezes. Imprima o resultado em ordem crescente
*/

public class Loteria {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int index;
        for(int i =0; i < 60;i++){
            numeros.add(i+1);
        }
        for(int j=0; j < 6; j++){
            index = generator();
            res.add(numeros.remove(index));
        }
        System.out.println(res);
    }
    public static int generator(){
        Random gerador = new Random();
        int aux = gerador.nextInt(59);
        if(aux == 0){
            return generator();
        }
        return aux;   
    }
}
