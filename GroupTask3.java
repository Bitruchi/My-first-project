package GroupTasks;

public class GroupTask3 {
    public static void main(String[] args) {
        int numbers[][] = {{10, 27, 34, 40, 56},
                           {12, 46, 67, 80, 55},
                           {2, 49, 50, 11, 33,}};

        for (int row = 0; row<numbers.length; row++) {
            for (int col = 0; col < 5; col++){
                if (numbers [row][col]%2==0)
                    System.out.print(numbers[row][col]+" ");
            }
            System.out.println();
        }


    }
}
