public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error";
        }

        double left, right;
        try {
            left = Double.parseDouble(args[0]);
            right = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            return "Error";
        }

        String operator = args[1];
        double result;
        switch (operator) {
            case "+":
                result = left + right;
                break;
            case "-":
                result = left - right;
                break;
            case "*":
                result = left * right;
                break;
            case "/":
                if (right == 0) {
                    return "Error"; // Handle division by zero      
                }
                result = left / right;
                break;
            case "%":
                if (right == 0) {
                    return "Error"; // Handle modulus by zero
                }
                result = left % right;
                break;
            default:
                return "Error"; // Unknown operator
        }

        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%s", result);
        }

    }
}