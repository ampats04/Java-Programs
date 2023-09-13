import java.util.ArrayList;
import java.util.List;

class noOccurence {

    public static int oneOccurence(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();
        List<Character> oneAppearance = new ArrayList<>();
        List<Character> allAppearance = new ArrayList<>();
        List<Character> allAppearance_two = new ArrayList<>();

        int pos = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            allAppearance_two.add(c);
            if (!oneAppearance.contains(c)) {
                oneAppearance.add(c);
            }

        }

        for (int i = 0; i < input.length(); i++) {

            char d = input.charAt(i);

            if (input.indexOf(d) == input.lastIndexOf(d)) {
                allAppearance.add(d);
            }
        }

        if (allAppearance.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < input.length() - 1; i++) {

            char[] c = input.toCharArray();
            if (allAppearance.get(0) == c[i]) {
                pos = allAppearance_two.indexOf(c[i]);
            }
        }
        System.out.println(allAppearance);
        return pos;
    }

    public static void main(String... args) {
        System.out.print(oneOccurence("aaaaaaaaaaahaack"));
    }
}