import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args) {
        String inputString = "hackerrank";

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (charIndexMap.containsKey(c)) {
                charIndexMap.put(c, -1);
            } else {
                charIndexMap.put(c, i);
            }
        }

        System.out.println("Unique characters in the string:");
        for (char c : charIndexMap.keySet()) {
            int index = charIndexMap.get(c);
            if (index != -1) {
                System.out.println("Character: " + c + ", First Index: " + index);
            }
        }
    }
}
