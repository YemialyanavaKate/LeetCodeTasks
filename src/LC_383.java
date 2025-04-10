import java.util.HashMap;
import java.util.Map;

public class LC_383 {
    public static void main(String[] args) {
        String magazine = "aab";
        String ransomNote = "aa";
        boolean output = true;
        Map<Character, Integer> mapMagazine = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            Character x = magazine.charAt(i);

            int currentCount = mapMagazine.getOrDefault(x, 0);
            mapMagazine.put(x, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char litter = ransomNote.charAt(i);

            int currentCount = mapMagazine.getOrDefault(litter, 0);
            if (currentCount == 0) {
                output = false;
            }
            mapMagazine.put(litter, currentCount - 1);
        }

        System.out.println(output);
    }

}
