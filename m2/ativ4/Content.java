/*
É possível implementar um método Java que troque o conteúdo de duas variáveis int? E no caso de dois objetos Integer?
Escreva um método para testar cada caso e explique os resultados.
*/

public class Content{
    public int first_int;
    public int second_int;
    
    public Integer first_integer;
    public Integer second_integer;

    public Content(){
        int first_int = 0;
        int second_int = 0;
        Integer first_integer = 0;
        Integer second_integer = 0;
    }
    public void changeVarContent(int first,int second){
        this.first_int = first;
        this.second_int = second;
    }

    public void printVarContent(){
        System.out.println("First: "+this.first_int+" Second: "+ this.second_int);
    }

    public void changeObjectContent(Integer first, Integer second){
        this.first_integer = first;
        this.second_integer = second;
    }

    public void printObjectContent(){
        System.out.println("First: "+this.first_integer+" Second: "+ this.second_integer);
    }

}