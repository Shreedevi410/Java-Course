public class FunctionInterviewQuestion {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        System.out.println("\nInterview Question:");
        System.out.println("Q: Write a Java program to perform basic arithmetic operations using methods.");
        System.out.println("A: Use separate methods for each operation and call them from main().");
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return x / y;
    }
}
