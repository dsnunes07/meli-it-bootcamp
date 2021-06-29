package bootcamp.java.individual.exercicio4;

public class TestClass {

    public static void main(String[] args) {
        Fraction f = new Fraction(3, 5);
        Fraction g = new Fraction(7, 8);
        System.out.println(f.add(g));
        System.out.println(g.add(f));
        System.out.println(f.minus(g));
        System.out.println(g.minus(f));
        System.out.println(f.multiply(g));
        System.out.println(g.multiply(f));
        System.out.println(f.divide(g));
        System.out.println(g.divide(f));
        System.out.println("--------");
        System.out.println(f.add(1));
        System.out.println(f.multiply(2));
        System.out.println(f.minus(1));
        System.out.println(f.divide(3));
    }
}
