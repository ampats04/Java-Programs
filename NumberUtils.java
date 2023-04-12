public class NumberUtils {

    public static boolean isNarcissistic(int number) {

        int temp = number;
        int sum = 0;

        String temp_1 = Integer.toString(temp);

        int[] numbers = new int[temp_1.length()];

        for (int i = 0; i < temp_1.length(); i++) {

            numbers[i] = Character.getNumericValue(temp_1.charAt(i));

            sum += Math.pow(numbers[i], temp_1.length());

            if (sum == number) {
                return true;
            }
        }

        return false;
    }

    public static void main(String... args) {

        System.out.print(isNarcissistic(1533));
    }

}