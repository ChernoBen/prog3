import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


public class Calendario {

  public static void imprimeCalendario(Integer ano,Integer mes){
   
    LocalDate data = LocalDate.of(ano, mes, 1);
    System.out.println("Sun Mon Tues Wed Thu Fri Sat");
    if(data.getDayOfWeek().getValue()!=7){
      for(int i=1; i <= (data.getDayOfWeek().getValue()); i++){
        System.out.print("    ");
      }
    }
    while(data.getMonthValue() == mes) {
      System.out.printf("%2d  ", data.getDayOfMonth());
      if(data.getDayOfWeek().getValue()%6 == 0)
        System.out.println();
      data = data.plusDays(1); //avança um dia
    }
  }
}