public class SortArgs {
    public static void sort(String[] args) {
        if (args == null || args.length == 0) {
            return;
        }

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
        for (int i = 0; i < intArgs.length; i++) {
            if (i > 0) {
                System.out.print(" ");  
            }
            System.out.print(intArgs[i]);
        }
        System.out.println();
    }
}