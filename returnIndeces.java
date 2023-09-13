import java.util.ArrayList;
import java.util.List;

class returnIndeces {

    public static List<Integer> retIn(int[] arr, int key) {

        List<Integer> count = new ArrayList<>();

        for (int x = 0; x < arr.length; x++) {
            if (key == arr[x]) {
                count.add(x);
            }
        }

        return count;
    }

    public static void main(String... args) {

        int[] num = { 5, 5, 3, 4, 5 };

        System.out.print(retIn(num, 5));
    }
}