import java.util.Scanner;
import java.util.Arrays;
/*
Numaempresaexisteumatabelaquearmazenaquantofoigastoemcadamês.Parafecharobalançodecadatrimestre,precisamossomarogastototal.SabendoqueemJaneiroforamgastos15000reais,emFevereiro23000reais,emMarço17000reais,emAbril17000reais,emMaio27000reais,emJunho17500reais,emJulho19000,emAgosto21000reais,emSetembro15000reais,emOutubro21000,emNovembro19000reaiseemDezembro20500reais,façaumprogramaquecalculeeimprimaogastototaleogastomédiodurantecadatrimestre.Useumarrayparaarmazenarosvalores da tabela..
*/
public class Balanco{
    public static void main(String[] args){
        float[] meses = new float[]{
            15000,23000,17000,17000,21000,
            15000,27000,17500,19000,21000,
            15000,21000,19000,20500
        };
        int trimestre = 0;
        float media = 0;
        float tri = 0;
        for(float mes: meses){
            if(trimestre >=3){
                media = tri /3;
                System.out.printf("Total: %.2f, Media: %.2f\n",tri,media);
                trimestre = 0;
                tri = 0;
                media = 0;
            }else{
                trimestre +=1;
                tri += mes;
            }
        }
    }
}