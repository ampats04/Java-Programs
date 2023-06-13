public class odd {

    public static String checker(String num) {

        return ((Integer.parseInt(num) - 2) == 0) ? "Odd" : "Even";
    }

    public static void main(String... args) {

        while (checker("10") >= 0) {

            System.out.print(checker(10));
        }

    }
}