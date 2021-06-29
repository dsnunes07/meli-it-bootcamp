package bootcamp.java.individual.exercicio6;

public class StringUtil {
    public static String rpad(String s, char c, int n) {
        for (int i = 0; i < n; i++)
            s += String.valueOf(c);
        return s;
    }

    public static String ltrim(String s) {
        int i = 0;
        String next = " ";
        String t = s;
        while (next.equals(" ")) {
            t = s.substring(i);
            next = String.valueOf(t.charAt(0));
            i++;
        }
        return t;
    }

    public static String rtrim(String s) {
        int length = s.length();
        int i = length - 1;
        String next = " ";
        String t = s;
        while (next.equals(" ")) {
            t = s.substring(0, i);
            next = String.valueOf(t.charAt(i - 1));
            i--;
        }
        return t;
    }

    public static String trim(String s) {
        return rtrim(ltrim(s));
    }
}
