public class DigPow {

    public static long digPow(int n, int p) {

        int[] arr = new int[String.valueOf(n).length()];
        int index = arr.length - 1;
        int sum = 0;

        for (int i = 0; i < index; i++, p++) {

            arr[index--] = n % 10;
            n /= 10;

            sum = (int) Math.pow(arr[i], p);

            if (sum == n) {
                return n;
            }

        }

        for (int x : arr) {
            System.out.print(x);
        }
        sum = (int) Math.pow(arr[0], p);
        System.out.println(sum);
        return -1;
    }

    public static void main(String... args) {

        System.out.print(digPow(81, 1));
    }
}
