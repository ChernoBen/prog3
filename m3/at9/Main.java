
/*
9- 
Escreva um método que receba um array de instâncias de classes que implementem a interface Runnable e retorne um objeto Runnable cujo método run() executa os objetos Runnable recebidos como parâmetro em ordem. Faça o retorno usando uma expressão lambda.
*/
public class Main {
  public static void main(String[] args) {
    Runnable[] arr = {
      () -> System.out.println("1"),
      () -> System.out.println("2"),
      () -> System.out.println("3"),
      () -> System.out.println("4"),
      () -> System.out.println("5"),
    };
    Obj.run(arr);
  }  
}
