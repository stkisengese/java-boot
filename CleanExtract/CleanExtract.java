public class CleanExtract {
    public static String extract(String s) {
         if (s == null) {
            return "";
        }
        String[] parts = s.split("\\|");
        StringBuilder result = new StringBuilder();
        
        for (String part : parts) {
            // Find first and last dot
            int firstDot = part.indexOf('.');
            int lastDot = part.lastIndexOf('.');
            
            String candidate;
            if (firstDot == -1) {
                // No dot: keep whole string
                candidate = part;
            } else if (firstDot == lastDot) {
                // One dot: take after the dot
                candidate = part.substring(firstDot + 1);
            } else {
                // Two or more dots: take between first and last
                candidate = part.substring(firstDot + 1, lastDot);
            }
            
            candidate = candidate.trim();
            if (!candidate.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(candidate);
            }
        }
        
        return result.toString();
    }
}