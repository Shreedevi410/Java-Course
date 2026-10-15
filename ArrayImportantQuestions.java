public class ArrayImportantQuestions {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 89, 45, 2, 12};

        System.out.println("Important Array Questions and Solutions\n");
        System.out.println("1. Largest element in the array: " + findLargest(arr));
        System.out.println("2. Smallest element in the array: " + findSmallest(arr));
        System.out.println("3. Sum of all elements: " + findSum(arr));
        System.out.println("4. Average of all elements: " + findAverage(arr));
        System.out.println("5. Second largest element: " + findSecondLargest(arr));
        System.out.println("6. Reversed array: ");
        printArray(reverseArray(arr));
        System.out.println("\n7. Duplicate elements in array: ");
        printArray(findDuplicates(arr));

        System.out.println("\nCommon interview questions on arrays:");
        System.out.println("- Find the largest/smallest element");
        System.out.println("- Find the sum and average");
        System.out.println("- Reverse an array");
        System.out.println("- Find duplicate values");
        System.out.println("- Find second largest element");
        System.out.println("- Check if an array is sorted");
        System.out.println("- Find missing number in a sequence");
        System.out.println("- Search an element using linear search");
        System.out.println("- Sort array using bubble sort or selection sort");
    }

    static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    static double findAverage(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++] = arr[i];
        }
        return reversed;
    }

    static int[] findDuplicates(int[] arr) {
        int[] duplicates = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate && !contains(duplicates, arr[i])) {
                duplicates[count++] = arr[i];
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = duplicates[i];
        }
        return result;
    }

    static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
