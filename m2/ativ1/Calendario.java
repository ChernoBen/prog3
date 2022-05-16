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
      System.out.println("Dom Seg Ter Qua Qui Sex Sab");

      for(int i=0; i < (data.getDayOfWeek().getValue()); i++){
        System.out.print("  ");
      }

      while(data.getMonthValue() == mes) {
        System.out.printf("%2d ", data.getDayOfMonth());
        if((data.getDayOfWeek().getValue()%7) == 0)
          System.out.println();
        data = data.plusDays(1); //avança um dia
      }
    }
}