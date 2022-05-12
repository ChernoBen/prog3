import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
/*
Repita o exercício 4 usando um ArrayList para armazenar a tabela.
*/
public class Balance{
    public static void main(String[] args){
        ArrayList<Integer> ms = new ArrayList<>(
            Arrays.asList(
                15000,23000,17000,17000,21000,15000,27000,17500,19000,21000,15000,21000,19000,20500
            )
        );
        int trimestre = 0;
        float media = 0;
        float tri = 0;
        for(int i=0; i<ms.size();i++){
            if(trimestre >=3){
                media = tri /3;
                System.out.printf("Total: %.2f, Media: %.2f\n",tri,media);
                trimestre = 0;
                tri = 0;
                media = 0;
            }else{
                trimestre +=1;
                tri += ms.get(i);

            }
        }
    }
}