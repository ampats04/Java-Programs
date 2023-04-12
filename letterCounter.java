
public class letterCounter {

    public static String countLetter(String letter) {

        letter.chars().parallel().count();

        return letter;
    }

    public static void main(String... args) {

        System.out.print(countLetter("abcabcabc"));
    }
}
