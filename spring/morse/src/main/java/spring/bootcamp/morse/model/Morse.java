package spring.bootcamp.morse.model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Morse {
    private String message;
    private Map<String, Character> morseDictionary = new HashMap<String, Character>();

    public Morse (String message) {
        this.message = message;
        morseDictionary.put(".-", 'a');
        morseDictionary.put("-...", 'b');
        morseDictionary.put("-.-.",  'c');
        morseDictionary.put("-..",  'd');
        morseDictionary.put(".",    'e');
        morseDictionary.put("..-.", 'f');
        morseDictionary.put("--.",  'g');
        morseDictionary.put("....", 'h');
        morseDictionary.put("..",   'i');
        morseDictionary.put(".---", 'j');
        morseDictionary.put("-.",   'k');
        morseDictionary.put(".-..", 'l');
        morseDictionary.put("--",   'm');
        morseDictionary.put("-.",   'n');
        morseDictionary.put("---",  'o');
        morseDictionary.put(".--.", 'p');
        morseDictionary.put("--.-", 'q');
        morseDictionary.put(".-.", 'r');
        morseDictionary.put("...",  's');
        morseDictionary.put("-",   't');
        morseDictionary.put("..-",  'u');
        morseDictionary.put("...-", 'v');
        morseDictionary.put(".--",  'w');
        morseDictionary.put("-..-", 'x');
        morseDictionary.put("-.--", 'y');
        morseDictionary.put("--..", 'z');
        morseDictionary.put(".----", '1');
        morseDictionary.put("..---",'2');
        morseDictionary.put("...--", '3');
        morseDictionary.put("....-", '4');
        morseDictionary.put(".....", '5');
        morseDictionary.put("-....", '6');
        morseDictionary.put("--...", '7');
        morseDictionary.put("---..", '8');
        morseDictionary.put("----.", '9');
        morseDictionary.put("-----", '0');
    }

    public String translate() {
        String translation = "";
        String morseChar = "";
        int spaceCount = 0;
        for (int i = 0; i < this.message.length(); i++) {
            Character c = this.message.charAt(i);
            morseChar += c;
            morseChar = morseChar.trim();
            if (c == ' ' || i == this.message.length() - 1)
                if (!morseChar.isEmpty()) {
                    translation += this.morseDictionary.get(morseChar);
                    morseChar = "";
                } else {
                    spaceCount++;
                }

            if (spaceCount == 2) {
                translation += " ";
                spaceCount = 0;
            }
        }
        return translation.toUpperCase();
    }
    public static void main(String[] args) {
        String message = "--- ..   -- --- .-. ... .";
        Morse m = new Morse(message);
        System.out.println(m.translate());
    }
}
