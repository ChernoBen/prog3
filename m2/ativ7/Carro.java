import java.util.*;

public class Carro{
    private Double gas = 0.0;
    private Double km = 0.0;
    private ArrayList<Double> percurso = new ArrayList<>();
    private Double eficiencia;

    public Carro(Double eficiencia){
        this.eficiencia = eficiencia;
    }

    public Double getGas(){
        return this.gas;
    }

    //obter distancia da origem
    public Double getKm(){
        System.out.println(this.km+" <------total");
        return this.km;
    }

    public void setKm(Double km){
        
        Double aux = km / this.eficiencia;
        if(aux<this.gas){
            this.gas = this.gas - aux;
            this.percurso.add(km);
            this.km += km;
        }else{
            System.out.println("Combustivel insuficiente");
        }
        System.out.println(this.km +" <----");
    }

    public void setGas(Double gas){
        this.gas = this.gas + gas;
    }

    public void printPercurso(){
        System.out.println(this.percurso.size());
        for(int i=0; i<this.percurso.size();i++){
            System.out.println("Ponto: "+i+1+" km: "+this.percurso.get(i));
        }
    }

}