import java.util.Scanner;

public class TemperatureAboveAverage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the amount of tempeartures you want to calculate: ");
        int amount = scanner.nextInt();

        double[] temperatures = new double[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < amount; i++) {
            sum += temperatures[i];
        }

        double average = sum / amount;

        System.out.println("The average temperature is: " + average);

        System.out.println("Temperatures above average: ");
        for (int i = 0; i < amount; i++) {
            if (temperatures[i] > average) {
                System.out.println("Temperature " + (i + 1) + ": " + temperatures[i]);
            }
        }

        scanner.close();
    }
}