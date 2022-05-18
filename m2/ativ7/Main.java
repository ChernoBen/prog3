/*
Implemente a classe Carro que modela um carro viajando em linha reta, consumindo gasolina à medida que se move. Forneça um método que modele a movimentação do carro por um determinado número de quilómetros,
um método para adicionar um determinado número de litros ao tanque de gasolina, 
um método para obter a distância corrente da origem e um método para obter o nível de combustível. 
Especifique a eficiência de combustível (em quilómetros/litro) no construtor. 
A classe Carro deve ser uma classe imutável? Por que ou Por que não? No programa principal, 
crie um carro, abasteça, e o faça andar por 50 km. 
Imprima as informações relacionadas ao combustível a cada 10 km.
*/
/*
R:
Não é necessario que a classe Carro seja imutavel pois uma boa solução é a adoçao de listas encadeadas
para guardar as informações a cada ponto do percurso.
*/
public class Main{
    public static void main(String[] args){
        Carro carro = new Carro(2.0);
        carro.setGas(300.0);
        carro.setKm(50);
        carro.printPercurso();
        carro.setKm(50.0);
        carro.printPercurso();
        carro.setKm(60.0);
        carro.printPercurso();
        System.out.println("Distancia total: "+carro.getKm()); 
    }
}