import java.util.Scanner;

public class KpkFpb {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    // program untuk mencari kpk dan fpb dari dua bilangan
    System.out.println("=== Program mencari KPK & FPB dari 2 bilangan ===\n");
    System.out.print("Masukkan bilangan pertama: ");
    int bil1 = userInput.nextInt();
    System.out.print("Masukkan bilangan kedua: ");
    int bil2 = userInput.nextInt();

    int kpk = cariKPK(bil1, bil2);
    System.out.println("KPK = " + kpk);

    int fpb = cariFPB(bil1, bil2);
    System.out.println("FPB = " + fpb);

    userInput.close();
  }
  // fungsi untuk mencari kpk 
  public static int cariKPK(int bil1, int bil2) {
    // mencari kpk
    int kpk = 0;

    if (bil1 > bil2) {
      for (int i = 1; i <= bil1; i++) {
        if ((bil2 * i) % bil1 == 0) {
          kpk = bil2 * i;
          break;
        }
      }
    } else {
      for (int i = 1; i <= bil2; i++) {
        if ((bil1 * i) % bil2 == 0) {
          kpk = bil1 * i;
          break;
        }
      }
    }

    return kpk;
  }
  // fungsi untuk mencari fpb
  public static int cariFPB(int bil1, int bil2) {
    // mencari fpb
    int fpb = 0;

    for (int i = bil1; i >= 1; i--) {
      if (bil1 % i == 0) {
        for (int j = 1; j <= bil2; j++) {
          if ((bil2 % j == 0) && (j == i)) {
            fpb = i;
            break;
          }
        }
      }

      if (fpb != 0) {
        break;
      }
    }

    return fpb;
  }
}

// the beautiful Dian Sastro :)