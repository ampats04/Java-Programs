import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class decoder {
    public static String whoLikesIt(String... names) {
        // Do your magic here

        // if (names.length == 0) {
        // return "test my testingcles";
        // }

        int len = names.length;

        switch (len) {

            case 0:
                return "no one likes this";

            case 1:
                return names[0] + "likes this";

            case 2:
                return names[0] + " and " + names[1] + " like this ";

            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this ";

            default:
                return names[0] + ", " + names[1] + " and " + (len - 2) + " others like this ";
        }

    }

    public static void main(String... args) {

        System.out.print(whoLikesIt("Nigga", "oten", "ywa", "asdff"));
    }
}