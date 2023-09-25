import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilities {

    public static boolean isValidString(String line, int line_lenght) {

        if (line == null || line.isEmpty()) {
            return false;
        } else if (line.length() >= line_lenght) {
            Pattern pat = Pattern.compile("^[a-zA-Z0-9_-]*$");
            Matcher mat = pat.matcher(line);
            return mat.matches();
        }
        return false;
    }

    public static String lowercaseFirst(String line) {

        int i = 0;
        String str;
        StringBuilder uppercase = new StringBuilder(),
                lowercase = new StringBuilder();

        for (; i < line.length(); i++) {
            if (line.charAt(i) == line.toUpperCase().charAt(i)) {
                uppercase.append(line.charAt(i));
            } else lowercase.append(line.charAt(i));
        }

        str = lowercase.append(uppercase).toString();

        return str;
    }

    public static boolean checkTextStats(String line, int min, int max) {

        try {
            int wordNum = 1, charNum = 0, pos;

            line = line.trim();
            pos = line.indexOf(" ");
            while (pos != -1) {
                charNum += line.length();
                wordNum++;
                pos = line.indexOf(" ", pos + 1);
            }

            return ((charNum / wordNum) > min && (charNum / wordNum) < max);

        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
