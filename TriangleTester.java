import java.util.*;

class TriangleTester {

    public static boolean isTriangle(int a, int b, int c) {

        int z[] = { a, b, c };

        Arrays.sort(z);

        boolean checker = (z[0] + z[1] > z[2]) ? true : false;

        return checker;

    }

    public static void main(String... args) {

        System.out.print(isTriangle(2, 2, 3));

    }
}
