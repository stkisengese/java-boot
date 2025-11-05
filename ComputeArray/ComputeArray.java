public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            // return null;
            return new int[0]; 
        }
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int remainder = n % 3;
            if (remainder == 0) {
                result[i] = n * 5;
            } else if (remainder == 1) {
                result[i] = n + 7;
            } else { // remainder == 2
                result[i] = n;
            }
        }
        return result;
    }
}