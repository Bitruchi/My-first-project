package GroupTasks;

public class GroupTask7 {
    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50};

        int largest = numbers[0];
        int secondLargest= numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] > secondLargest) {
                largest = numbers[i];
            }


        }
        System.out.println("The second largest nubmer in the Array is " + secondLargest);

    }
}