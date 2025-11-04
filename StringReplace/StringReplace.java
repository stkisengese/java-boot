public class StringReplace {
    public static String replace(String s, char target, char replacement) {
        if (s == null) {
            return s;
        }
        return s.replace(target, replacement);
    }
}