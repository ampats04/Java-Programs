public class DeadFishnotMap {

    public static int[] parse(String data) {

        int len = data.length();
        int count = 0;
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
                    result[count] = sum;
                    count++;
                    break;

            }
        }
        int[] finalResult = new int[count];
        System.arraycopy(result, 0, finalResult, 0, count);
        return finalResult;
    }

    public static void main(String... args) {
        int[] parsedData = parse("iiisdoso");

        for (int num : parsedData) {
            System.out.print(num + " ");
        }

    }
}