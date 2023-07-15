public class ipAddress {

    public static String longToIP(long ip) {

        StringBuilder sb = new StringBuilder();

        for (int i = 3; i >= 0; i--) {
            long octet = (ip >> (i * 8)) & 0xFF;
            sb.append(octet);

            if (i > 0) {
                sb.append(".");
            }
        }

        return sb.toString();
    }

    public static void main(String... args) {

        System.out.print(longToIP(2149583361L));
    }
}