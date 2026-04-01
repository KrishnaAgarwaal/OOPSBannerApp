import java.util.HashMap;
import java.util.Map;


public class OOPSBannerApp {

    // Method to build map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****   ",
                " **   **  ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                " **   **  ",
                "  *****   "
        });

        map.put('P', new String[]{
                " *******  ",
                " **    ** ",
                " **    ** ",
                " *******  ",
                " **       ",
                " **       ",
                " **       "
        });

        map.put('S', new String[]{
                "  *****   ",
                " **   **  ",
                " **       ",
                "  *****   ",
                "       ** ",
                " **   **  ",
                "  *****   "
        });

        return map;
    }

    // Method to print banner
    public static void printBanner(String text, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                line.append(map.get(ch)[i]);
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        printBanner("OOPS", patternMap);
    }
}