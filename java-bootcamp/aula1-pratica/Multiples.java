import java.util.Scanner;

/* Desenvolva um programa para mostrar os primeiros n números múltiplos de m, 
sendo n e m valores que o usuário irá inserir via console. Lembre-se que um 
número a é divisível por b se a é divisível por b. */

class Multiples {
  public static void main(String[] args) {
    int m, n, i, k;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite n: ");
    n = Integer.parseInt(scanner.nextLine());
    System.out.println("Digite n: ");
    m = Integer.parseInt(scanner.nextLine());
    i = 0;
    k = m;
    while (i < n) {
      if (k % m == 0) {
        System.out.println(k);
        i++;
      }
      k++;
    }
    scanner.close();
  }
}