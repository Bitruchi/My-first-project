package GroupTasks;

public class GroupTask5 {
    public static void main(String[] args) {
        int numbs = 10;
        int[] fibonacci = new int[numbs];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < numbs; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        }
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numbs; i++) {
            System.out.print(fibonacci[i] + "");
        }
    }
}