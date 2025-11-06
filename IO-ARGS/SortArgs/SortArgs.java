public class SortArgs {
    public static void sort(String[] args) {
        // Convert String array to Integer array for sorting
        Integer[] intArgs = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                intArgs[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                // If parsing fails, leave the original string in place
                return; 
            }
        }
        // Sort the Integer array
        java.util.Arrays.sort(intArgs);

        // print numbers seperated by spaces, end in a newline
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArgs.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(intArgs[i]);
        }
        sb.append("\n");
        System.out.print(sb.toString());
    }
}