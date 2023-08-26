package GroupTasks;

public class GroupTask6 {
    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] > min) {
                max = numbers[i];
            }


        }
        System.out.println("Maximum nubmer of the Array is " + max);
        System.out.println("Minimum number of the Array is " + min);
    }
}