public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    static boolean isPalindrome(int number) {
        if (number < 0 || (number != 0 && number % 10 == 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (number > reversedHalf) {
            reversedHalf = reversedHalf * 10 + number % 10;
            number /= 10;
        }

        return number == reversedHalf || number == reversedHalf / 10;
    }
}
