import java.util.HashMap;
import java.util.Stack;

public class Troll {

    public static String disemvowel(String Z) {

        return Z.replaceAll("(?i)[aeiou]", "");
    }

    static public void main(String... args) {

        System.out.print(disemvowel("LOL"));
    }
}