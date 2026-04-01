/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in a Class
 *
 * @author Krishna
 * @version 7.0
 */

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create objects
        CharacterPattern O = new CharacterPattern('O', new String[]{
                "  *****   ",
                " **   **  ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                " **   **  ",
                "  *****   "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " *******  ",
                " **    ** ",
                " **    ** ",
                " *******  ",
                " **       ",
                " **       ",
                " **       "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "  *****   ",
                " **   **  ",
                " **       ",
                "  *****   ",
                "       ** ",
                " **   **  ",
                "  *****   "
        });

        // Store in array
        CharacterPattern[] patterns = {O, O, P, S};

        // Build banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]);
            }

            System.out.println(line);
        }
    }
}