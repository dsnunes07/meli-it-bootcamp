import java.util.Scanner;

/* Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor que o usuário 
irá inserir pelo console. Lembre-se que um número é par quando divisível por 2. */

class EvenNumbers {
  public static void main(String [] args) {
    System.out.println("Digite n: ");
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < 2*n; i+=2)
    System.out.println(i);
    scanner.close();
  }
}
