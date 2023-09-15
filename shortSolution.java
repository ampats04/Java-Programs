import java.util.*;

class shortSolution {

    public static int oneChar(String input) {

        int pos = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            input = input.replaceAll("//s+", "").toLowerCase();
            char c = input.charAt(i);

            if (input.indexOf(c) == input.lastIndexOf(c)) {
                arr.add(i);
                pos = arr.get(0);

            }

        }

        return arr.isEmpty() ? -1 : pos;
    }

    public static void main(String... args) {

        System.out.print(oneChar("aaa"));
    }
}