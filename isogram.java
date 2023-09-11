import java.util.*;

public class isogram {
    public static boolean isIsogram(String str) {

        char arr[] = str.toLowerCase().toCharArray();

        Arrays.sort(arr);

        for (int i = 0; i < str.length() - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String... args) {

        System.out.print(isIsogram("abc"));

    }
}