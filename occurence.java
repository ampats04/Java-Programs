import java.util.ArrayList;
import java.util.List;

class occurence {

    public static String letterOccurence(String l) {

        l = l.replaceAll("\s+", "").toLowerCase();

        List<Character> count = new ArrayList<>();
        List<Character> count_two = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < l.length(); i++) {
            count.add(l.charAt(i));
        }

        for (char c : count) {

            if (!count_two.contains(c)) {
                count_two.add(c);
            }
        }

        for (int i = 0; i < l.length(); i++) {

            for (char c : count_two) {
                if (c == l.charAt(i)) {

                }
            }
        }
        System.out.print(count_two);
        // System.out.print(counter);
        return "";
    }

    public static void main(String... args) {

        letterOccurence("aaabC  d");

    }
}