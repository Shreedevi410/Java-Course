public class FibonacciSeries {
    public static void main(String[] args) {
        int terms = 10;
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci series: ");

        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
