import java.util.Comparator;
import java.util.function.Consumer;

public class TestaExecAdiada {
    //Runnable ler doc desta interface
    /*
    public static void repete(int  n, Runnable func){
        for(int i = 0;i<n;i++){
            func.run();
        }
    }   
    */
    public static void repete(int n,Consumer<Integer>func ){
        for(int i = 0;i<n;i++){
            func.accept(i);
        }
    }
    public static Comparator<String> compare(int direcao){
        return (String s1,String s2 )->direcao * s1.compareTo(s2);
    }
}
