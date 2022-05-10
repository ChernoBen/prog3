import java.util.*;

public class ArrList {
    public static void main(String[] args){
        String leitor = "um dois trees";
        //String [] arr = leitor.split(" ");
        ArrayList<String>text = new ArrayList<>(
            Arrays.asList(
                leitor.split(" ")
            )
        );

        ArrayList<String> arr2 = ArrList.order(text);
        for(int i=0;i < arr2.size(); i++){
            System.out.println(arr2.get(i));
        }
    }

    public static ArrayList<String> order(ArrayList<String> arr){
        String aux;
        for(int i=0; i<arr.size(); i++){
            for(int j=0;j<arr.size()-1;j++){
                if(arr.get(j).length()>arr.get(j+1).length()){
                    aux = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,aux);
                }
            }
        }  
        return arr;
    }
}
