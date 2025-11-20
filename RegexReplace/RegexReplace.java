public class RegexReplace {
    public static String removeUnits(String s) {
        if (s == null) {
            return null;
        }
        // Remove "cm" and "€" if they follow a number and are followed by a space
        return s.replaceAll("(\\d+)(cm|€)(?=\\s|$)", "$1");
    }

    public static String obfuscateEmail(String s) {
        if (s == null) return null;

        // Split the email into username and domain
        String[] parts = s.split("@", 2);
        if (parts.length != 2) return s; // Not a valid email

        String username = parts[0];
        String domain = parts[1];

        // Obfuscate username
        if (username.contains(".") || username.contains("_") || username.contains("-")) {
            // Hide characters next to special characters
            username = username.replaceAll("([._-])[A-Za-z0-9]", "$1*");
        } else if (username.length() > 3) {
            // Hide last 3 characters
            username = username.substring(0, username.length() - 3) + "***";
        }

        // Obfuscate domain
        String[] domainParts = domain.split("\\.");
        if (domainParts.length >= 3) {
            // Format: @<third>.<second>.<top>
            domain = "*." + domainParts[1] + ".***";
        } else if (domainParts.length == 2) {
            // Format: @<second>.<top>
            String topLevelDomain = domainParts[1];
            if (topLevelDomain.equals("com") || topLevelDomain.equals("org") || topLevelDomain.equals("net")) {
                domain = "*****." + topLevelDomain;
            } else {
                domain = "*****.***";
            }
        }

        return username + "@" + domain;
    }
}
