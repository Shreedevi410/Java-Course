import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] indices = findPair(numbers, target);
        if (indices[0] == -1) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair found at indices " + indices[0] + " and " + indices[1]);
        }
    }

    // Find two different indices whose values add up to the target.
    static int[] findPair(int[] numbers, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            long complement = (long) target - numbers[i];
            if (complement >= Integer.MIN_VALUE && complement <= Integer.MAX_VALUE) {
                Integer matchingIndex = valueToIndex.get((int) complement);
                if (matchingIndex != null) {
                    return new int[] {matchingIndex, i};
                }
            }
            valueToIndex.put(numbers[i], i);
        }

        return new int[] {-1, -1};
    }
}
