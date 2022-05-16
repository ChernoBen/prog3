import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calendario {
  public static void main(String[] args) {
    //Lê o mes e o ano
    Scanner leitor = new Scanner(System.in);
    System.out.printf("\nEntre com o ano: ");
    int ano = leitor.nextInt();
    System.out.printf("\nEntre com mês: ");
    int mes = leitor.nextInt();
    //definindo a data inicial
    LocalDate data = LocalDate.of(ano, mes, 1);
    //imprime o calendário
    imprimeCalendario(data,mes);
  }

  public static void imprimeCalendario(LocalDate data, int mes){
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