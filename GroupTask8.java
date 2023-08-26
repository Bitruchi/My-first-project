package GroupTasks;

public class GroupTask8 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 23, 8, 15, 30, 7, 18};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        }
    }