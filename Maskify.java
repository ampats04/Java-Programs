public class Maskify {

    public static String maskify(String str) {

        return (str.length() - 4 > 0)
                ? str = "#".repeat(str.length() - 4) + str.substring(str.length() - 4, str.length())
                : str;

    }

    public static void main(String... args) {
        System.out.print(maskify("jeremyyyyyyyyyyyyyyyyyyyyy"));

        // return str.replaceAll(".(?=.{4})", "#");

    }
}
