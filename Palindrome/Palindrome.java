public class Palindrome {
    public static boolean isPalindrome(String s) {
        // Remove leading/trailing spaces
        s = s.strip().toLowerCase();
       // s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Create a reversed version of the string
        String reversed = new StringBuilder(s).reverse().toString();

        // Compare original and reversed strings
        return s.equals(reversed);
    }
}