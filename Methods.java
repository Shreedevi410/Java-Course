public class Methods {
    public static void main(String[] args) {
        greet("Alex");

        int sum = add(10, 5);
        System.out.println("Sum: " + sum);

        System.out.println("Is 8 even? " + isEven(8));
    }

    // A method that takes a parameter and does not return a value.
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // A method that takes parameters and returns a value.
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
