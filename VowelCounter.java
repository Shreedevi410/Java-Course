public class VowelCounter {
    public static void main(String[] args) {
        String text = "Java programming";
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toLowerCase(text.charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}
