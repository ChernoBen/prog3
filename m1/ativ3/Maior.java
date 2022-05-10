import java.util.Scanner;
import java.util.Arrays;

public class Maior{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o Primeiro numero:");
        int primeiro = leitor.nextInt();
        System.out.println("Entre com o Segundo numero:");
        int segundo = leitor.nextInt();
        System.out.println("Entre com o Terceiro numero");
        int terceiro = leitor.nextInt();
        int[] valores = new int[]{primeiro,segundo,terceiro};
        Arrays.sort(valores);
        System.out.printf("Maior:%d\n",valores[2]);
    }
}