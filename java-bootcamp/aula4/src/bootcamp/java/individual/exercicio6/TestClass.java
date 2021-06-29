package bootcamp.java.individual.exercicio6;

public class TestClass {
    public static void main(String[] args) {
        String s = "    Oi  Meli";
        System.out.println("[" + StringUtil.ltrim(s) + "]");
        s = "muitos espaços          ";
        System.out.println("[" + StringUtil.rtrim(s) + "]");
        s = "     oi      meli   :)    ";
        System.out.println("[" + StringUtil.trim(s) + "]");
    }
}
