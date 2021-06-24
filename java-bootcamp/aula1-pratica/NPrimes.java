// Desenvolva um programa para mostrar por console os primeiros n números primos, sendo um valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class NPrimes {
  public static boolean isPrime(int n) {
    for (int i = 2; i < n; i++)
      if (n % i == 0)
        return false;
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite n: ");
    int n = Integer.parseInt(scanner.nextLine());
    int n_primes = 0;
    int i = 2;
    while (n_primes < n) {
      if (isPrime(i)) {
        n_primes++;
        System.out.println(i);
      } 
      i++;
    }
    scanner.close();
  }
}
