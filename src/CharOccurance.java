import java.util.HashMap;
import java.util.Map;

public class CharOccurance {

    public static void getCharCount(String name) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] strarr = name.toCharArray();
        for (char c : strarr) {
            if (!String.valueOf(c).isBlank()) {
                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                } else {
                    charMap.put(c, 1);
                }
            }
        }
            System.out.println(name + " : " + charMap);
        }

    public static void main(String[] args) {
        getCharCount("Think Future Technologies");
    }
}
