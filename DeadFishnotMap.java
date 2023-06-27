import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeadFishnotMap {

    public static int[] parse(String data) {

        int len = data.length();
        int sum = 0;
        int[] result = new int[len];
        int a = 1;

        for (int i = 0; i < len; i++) {

            char c = data.charAt(i);

            switch (c) {

                case 'i':
                    sum += a;
                    break;

                case 'd':
                    sum -= a;
                    break;

                case 's':
                    sum = (int) Math.pow(sum, 2);
                    break;

                case 'o':
                    result[i] = sum;
                    break;

            }
        }

        return result;
    }

    public static void main(String... args) {
        parse("iiisdoso");
    }
}