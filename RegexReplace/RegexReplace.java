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
        if (parts.length != 2) return s;
    
        String username = parts[0];
        String domain = parts[1];
    
        // Obfuscate username
        if (username.matches(".*[-._].*")) {
             // find last occurrence of -, . or _
            int lastDot = username.lastIndexOf('.');
            int lastDash = username.lastIndexOf('-');
            int lastUnd = username.lastIndexOf('_');
        
            int lastSymbol = Math.max(lastDot, Math.max(lastDash, lastUnd));
        
            int charsToMask = username.length() - (lastSymbol + 1);
            if (charsToMask > 0) {
                username = username.substring(0, lastSymbol + 1) + "*".repeat(charsToMask);
            }
        } else {
            if (username.length() > 3) {
                String prefix = username.substring(0,3);
                int remaining = username.length() - 3;
                int statsToAdd = Math.min(3, remaining);
                username = prefix + "*".repeat(statsToAdd);

                if (remaining > statsToAdd) {
                    username = username + username.substring(3 + statsToAdd);
                }
            }
            // If length is 3 or less, do nothing
        }
    
        // Obfuscate domain
        String[] domainParts = domain.split("\\.");
        if (domainParts.length >= 3) {
            // Format: @<third>.<second>.<top>
            domain = "*******." + domainParts[domainParts.length - 2] + ".***";
        } else if (domainParts.length == 2) {
            // Format: @<second>.<top>
            String topLevelDomain = domainParts[1];
            if (topLevelDomain.equals("com") || topLevelDomain.equals("org") || topLevelDomain.equals("net")) {
                domain = "*******." + topLevelDomain;
            } else {
                domain = "*******.**";
            }
        }
        return username + "@" + domain;
    }
}
