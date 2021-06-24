// Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que o usuário irá inserir pelo console.

import java.util.Scanner;

public class Primes {

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
    System.out.println(isPrime(n));
    scanner.close();

  }
}
