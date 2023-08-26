package GroupTasks;

import java.util.Scanner;

public class GroupTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysWeek = 7;
        double[] temperatures = new double[daysWeek];


        for (int i = 0; i < daysWeek; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        double maxTemperature = temperatures[0];
        double minTemperature = temperatures[0];


        for (int i = 1; i < daysWeek; i++) {
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }

            if (temperatures[i] < minTemperature) {
                minTemperature = temperatures[i];
            }
        }

        System.out.println("Highest temperature of the week: " + maxTemperature);
        System.out.println("Lowest temperature of the week: " + minTemperature);
    }

}



