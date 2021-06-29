package bootcamp.java.individual;

public class Exercicio2 {
    public static void main(String[] args) {
        double x_price = 1.13;
        double x_rate = 1.48;
        double y_price = 18.4;
        double y_rate = 0.32;
        int year = 2021;

        while (x_price <= y_price) {
            System.out.println("Empresa X - 01/01/" + year + " - Valor da empresa: " + x_price + "m");
            System.out.println("Empresa Y - 01/01/" + year + " - Valor da empresa: " + y_price + "m");
            x_price *= (1.0 + x_rate);
            y_price *= (1.0 + y_rate);
            year++;
        }
    }
}
