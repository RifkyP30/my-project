import java.util.Scanner;

public class FaktorBilangan {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Masukkan bilangan: ");
    int bilangan = userInput.nextInt();

    cariFaktor(bilangan);

  }
  // membuat fungsi untuk mencari faktor
  public static void cariFaktor(int bilangan) {
    // mencari faktor
    System.out.print("Faktor: ");

    for (int i = 1; i <= bilangan; i++) {
      if (bilangan % i == 0) {
        if (i == bilangan) {
          System.out.print(i);
        } else {
          System.out.print(i + ", ");
        }
      }
    }

  }
}