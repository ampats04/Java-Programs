import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean check(String sentence) {
        Set<Character> uniqueLetters = new HashSet<>();
        String lowerCaseSentence = sentence.toLowerCase();

        for (char c : lowerCaseSentence.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueLetters.add(c);
            }
        }

        return uniqueLetters.size() == 26;
    }

    public static void main(String... args) {
        System.out.print(check("The quick brown fox jumps over the lazy dog."));
    }
}