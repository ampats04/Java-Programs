import java.util.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int ans = 0;
        int x = 0;

        for (int i = binary.size() - 1; i >= 0; i--) {

            if (binary.get(i) == 1) {
                ans += (int) Math.pow(2, x);
                // System.out.print(Math.pow(2, x) + "\n");

            }

            x++;

        }

        return ans;
    }

    public static void main(String... args) {

        System.out.print(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));

    }

}