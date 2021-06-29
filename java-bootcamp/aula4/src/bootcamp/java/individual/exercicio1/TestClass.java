package bootcamp.java.individual.exercicio1;

public class TestClass {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(19432.45, "1234", "0067776");
        System.out.println(cc);
        ContaCorrente ccCopy = new ContaCorrente(cc);
        System.out.println(ccCopy);
    }
}
