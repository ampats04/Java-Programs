public class Kata {
    public static String reverseWords(final String original) {

        String temp = "";

        for (int i = 0; i < original.length(); ++i) {

            char fin = original.charAt(i);
            temp = fin + temp;
        }

        return temp;

    }

    public static void main(String... args) {

        System.out.print(reverseWords("double  spaced  words"));
    }
}