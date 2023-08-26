package GroupTasks;

public class GroupTask4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7}
        };

        int sumEven = 0;
        int sumOdd = 0;

        for (int[] row : numbers) {
            for (int num : row) {
                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);



    }
}
