package bootcamp.java.individual.exercicio5;

public class TestClass {
    public static void main(String[] args) {
        Data d = new Data(90, 40, 1500);
        System.out.println(d.isValid());
        d = new Data(28, 11, 2004);
        System.out.println(d);
        System.out.println(d.isValid());
        for (int i = 0; i < 365; i++) {
            d.addDay();
            System.out.println(d);
        }
    }
}
