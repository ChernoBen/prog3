import java.util.*;
import java.lang.*;

/*
FaçaumprogramaqueextraiaaspalavrascontidasemumaStringecoloque-asemumArraydeStrings.EmseguidaoprogramadevepercorreroArraymostrandoaspalavrasemordemdetamanho.Primeiroaspalavrascom1caracter,depoisaspalavras com 2 caracteres, e assim por diante
*/
public class ArrString {
    public static void main(String[] args){
        String leitor = "um dois trees";
        String [] arr = leitor.split(" ");
        String [] arr2 = ArrString.order(arr);
        for(int i=0;i < arr2.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static String[] order(String[] arr){
        String aux;
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j].length()>arr[j+1].length()){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }  
        return arr;
    }
}
