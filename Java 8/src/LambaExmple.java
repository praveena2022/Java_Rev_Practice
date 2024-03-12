interface Operation {
    double apply(double num1, double num2);
}

public class LambaExmple {
    public static double operate(double num1, double num2, String operator) {
        Operation operation;


        switch (operator) {
            case "+":
                operation = (x, y) -> x + y;
                break;
            case "-":
                operation = (x, y) -> x - y;
                break;
            case "*":
                operation = (x, y) -> x * y;
                break;
            case "/":
                operation = (x, y) -> x / y;
                break;
            default:
                System.out.println("Invalid operator");
                return 0;
        }

        return operation.apply(num1, num2);
    }

    public static void main(String[] args) {

        double result = operate(5, 3, "+");
        System.out.println(result);  // Output: 8.0

        result = operate(5, 3, "-");
        System.out.println(result);  // Output: 2.0

        result = operate(5, 3, "*");
        System.out.println(result);  // Output: 15.0

        result = operate(5, 3, "/");
        System.out.println(result);
        
    }
}
