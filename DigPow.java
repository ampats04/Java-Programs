public class DigPow {

    public static long digPow(int n, int p) {

        int[] arr = new int[String.valueOf(n).length()];
        int index = arr.length - 1;

        long result = -1;
        int sum = 0;

        while (n > 0) {
            arr[index--] = n % 10;
            n /= 10;

        }
        for (; index > arr.length; index++) {
            System.out.print(Math.pow(arr[index], p));
            p++;
            sum = arr[index];

            System.out.print("asdasd");
        }
        System.out.print(Math.pow(arr[index], p));
        return -1;
    }

    public static void main(String... args) {

        System.out.print(digPow(81, 1));
    }
}
