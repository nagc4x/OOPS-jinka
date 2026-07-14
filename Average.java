import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by space or newline (end input with EOF / Ctrl+Z then Enter on Windows):");
        double sum = 0.0;
        int count = 0;
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
            count++;
        }
        sc.close();
        if (count == 0) {
            System.out.println("No numbers provided.");
        } else {
            double avg = sum / count;
            System.out.printf("Average: %.2f\n", avg);
        }
    }
}
