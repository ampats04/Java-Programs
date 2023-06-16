import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DeadFish {

    public static int[] parse(String data) {

        int len = data.length();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {

            char c = data.charAt(i);

            map.put(c, i);

        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + ": " + value);
        }

        return null;
    }

    public static void main(String... args) {

        int[] result = parse("iiisdoso");

        System.out.print(Arrays.toString(result));
    }
}