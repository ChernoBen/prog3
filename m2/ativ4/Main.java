import java.util.*;

/*
É possível implementar um método Java que troque o conteúdo de duas variáveis int?
E no caso de dois objetos Integer? Escreva um método para testar cada caso e explique os resultados.
*/

public class Main{
    public static void main(String[] args){
        Content ct = new Content();
        int firstInt = 5;
        int secondInt = 6;

        Integer firstInteger = 7;
        Integer secondInteger = 8;
        ct.changeObjectContent(fistInt,secondInt);
        ct.printObjectContent();

        ct.changeVarContent(fistInteger,secondInteger);
        ct.printVarContent();

    }
}