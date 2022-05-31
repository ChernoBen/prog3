import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Implemente o método void ordenaNaSorte(ArrayList<String> strings, Comparator<String> comp) que continua chamando Collections.shuffle() para embaralhar o ArrayList de strings até que os elementos estejam em ordem crescente, tal como determinado pelo comparador.
*/

public class OrderArr {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>(List.of("um", "dezenove", "dois", "cinco", "quatrocentosEcinquenta"));
    orderArr(arr,(x, y)->x.length()-y.length());
    System.out.println(arr);
  }
  static void orderArr(ArrayList<String> arr, Comparator<String> comparator) {
    int counter = 0;
    while (counter < arr.size()) {
      for (int i = 0;i<arr.size()-1;i++) {
        if (comparator.compare(arr.get(i), arr.get(i + 1)) <= 0) {
          counter++;
        } else {
          Collections.shuffle(arr);
          counter = 0;
          break;
        }
      }
    }
  }
}