import java.util.*;

public class Main {
    public static void main(String[] args){
        //Passando uma expressao lambda como parametro  p/ um metodo
        //util para  criacao de callbacks
        TestaExecAdiada.repete(10,(Integer i )->System.out.println("Prog - 3 - "+ i));
        Comparator <String> c1 = TestaExecAdiada.compare(1);
        
    }
}
//utilizar decorator p/ definir interfaces funcionais
