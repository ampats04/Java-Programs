class Solution {
    public static String camelCase(String input) {

        for (int i = 0; i < input.length(); i++) {

            char test = input.charAt(i);

            boolean answer = Character.isUpperCase(test);

            if (answer) {

            }   
        }

        return input;
    }

    public static void main(String... args) {

        System.out.print(camelCase("SDSDsada"));
    }
}