/*
Implemente uma classe imutável chamada Point que descreva um ponto no plano. 
Forneça um construtor para criar um ponto com coordenadas específicas, um construtor sem argumentos para definir um ponto na origem e métodos getX() e getY para obter as coordenadas do ponto. Escreva também os métodos translate() e scale(). O método translate deve mover o ponto por uma determinada distância na direção x e y. O método de scale() redimensiona ambas as coordenadas por um determinado fator. Implemente esses métodos para que eles retornem novos pontos com os resultados. 
Por exemplo, Point p = new Point(3, 4).translate(1, 3).scale(0.5), deve definir p como um ponto com coordenadas (2, 3.5).
*/

public class Main{
    public static void main(String[] args){
        Point point = new Point();
        System.out.println("X: "+point.getX()+" Y: "+ point.getY()+"\n");
        point = point.translate(2.2,3.3).scale(0.5);
        System.out.println("X: "+point.getX()+" Y: "+ point.getY());
    }
}