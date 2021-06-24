import java.util.Scanner;

/* Desenvolver um programa para exibição por console os n primeiros
números naturais que têm pelo menos de m dígitos de d, sendo n, m e d
valores que o utilizador vai enviar pelo console.


Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve
exibir os primeiros 5 números naturais que tenham pelo menos 2 dígitos 3
no console. Neste caso, a saída será: 33, 133 , 233, 303, 313. */

// Obs: considerando 0 <= d <= 9

public class MDigits {

  /* counts how many times a digit appears in a number in O(d) time,
  where d is the amount of "number" digits */
  public static int countDigitFrequency(int number, int digit) {
    int freq = 0;
    while (number > 0) {
      int d = number % 10;
      if (d == digit)
        freq++;
      number = number/10;
    }
    return freq;
  }

  public static void mDigits(int n, int m, int d) {
    int k = (1 + 10*(m - 1))*d;
    int count = 0;
    while (count < n) {
      if (countDigitFrequency(k, d) >= m) {
        System.out.println(k);
        count++;
      }
      k++;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int m = Integer.parseInt(scanner.nextLine());
    int d = Integer.parseInt(scanner.nextLine());
    mDigits(n, m, d);
    scanner.close();
  }
  
}
