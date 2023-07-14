public class HumanReadableTime {

    public static String makeReadable(int second) {

        int hours = second / 3600;
        int minutes = (second % 3600) / 60;
        int seconds = second % 60;

        if (hours < 100) {
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        }

        return null;
    }

    public static void main(String... args) {

        System.out.print(makeReadable(10000000));
    }
}