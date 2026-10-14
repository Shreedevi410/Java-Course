public class Loops {
    public static void main(String[] args) {
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nwhile loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        System.out.println("\ndo-while loop:");
        count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count <= 5);

        System.out.println("\nenhanced for loop:");
        int[] numbers = {10, 20, 30};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
