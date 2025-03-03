import java.util.HashMap;
import java.util.Map;

class isomorphic{
    public boolean isomorphicc(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Create a hashmap to store character mappings
        Map<Character, Character> charMappingMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!charMappingMap.containsKey(original)) {
                if (!charMappingMap.containsValue(replacement)) {
                    charMappingMap.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char mappedCharacter = charMappingMap.get(original);
                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        isomorphic solution = new isomorphic();
        System.out.println(solution.isomorphicc("egg", "add"));   // true
        System.out.println(solution.isomorphicc("foo", "bar"));   // false
        System.out.println(solution.isomorphicc("paper", "title"));// true
        System.out.println(solution.isomorphicc("badc", "baba")); // false
    }
}
