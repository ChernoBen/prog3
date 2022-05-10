package matrizBidimensional;

import java.util.Scanner;

public class matrizBidimensional {
	public static void main(String[] args){
		int[][] matriz = new int[3][3];
		//Preencher a matriz
		Scanner leitor = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.printf("[%d][%d]", i, j);
				matriz[i][j] = leitor.nextInt();
			}
		}
		quadradoMagico(matriz);
	}
	public static void quadradoMagico(int[][] matriz){
		boolean ehQuadradoMagico = true;
    	int primeiraLinha = 0;
    	int primeiraColuna = 0;
        
        for (int i=0;i<3;i++){
        	int totalLinha = 0;
        	int totalColuna = 0;
        	for (int j=0;j<3;j++){
        		if(i==0){
        			primeiraLinha+=matriz[i][j];
        			primeiraColuna+=matriz[j][i];
        		}
        		totalLinha+=matriz[i][j];
        		totalColuna+=matriz[j][i];
        	}
    		if(totalLinha!=primeiraLinha || totalLinha!=totalColuna || totalColuna!=primeiraColuna || primeiraColuna!=primeiraLinha){
    			ehQuadradoMagico = false;
    		}
        }
        if(ehQuadradoMagico){
        	System.out.println("É um quadrado mágico");
        } else {
        	System.out.println("Não é um quadrado mágico");
        }
	}
}