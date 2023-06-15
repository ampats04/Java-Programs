import java.util.Arrays;

public class DeadFish {

    public static int[] parse(String data) {

        int len = data.length();
        int[] d = new int[len];

        for (int i = 0; i < len; i++) {

            d[i] = data.charAt(i);

        }

        return d;
    }

    public static void main(String... args) {

        int[] result = parse("asdf");

        System.out.print(Arrays.toString(result));
    }
}