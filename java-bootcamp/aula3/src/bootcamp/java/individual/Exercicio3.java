package bootcamp.java.individual;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int qtd_produtos = 3;
        double preco_total = 0.0;
        int i = 0;
        Scanner s = new Scanner(System.in);
        while (i < qtd_produtos) {
            System.out.println("Digite o nome do produto: ");
            String nome = s.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = Double.parseDouble(s.nextLine());
            preco_total += preco;
            System.out.println("Digite a quantidade do produto: ");
            int qtd = Integer.parseInt(s.nextLine());
            printProductData(i + 1, nome, preco, qtd);
            i++;
        }
        System.out.println("Valor total: R$" + preco_total);
    }

    private static void printProductData(int i, String nome, double preco, int qtd) {
        System.out.println("Produto " + i);
        System.out.println(nome);
        System.out.println("R$ " + preco);
        System.out.println("Quantidade: " + qtd);
    }
}
