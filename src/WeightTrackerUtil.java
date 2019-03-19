import java.util.Scanner;

public class WeightTrackerUtil {
    private WeightTrackerUtil(){}
    public static int validateIdInput(WeightTracker weightTracker, Scanner scanner) {
        int id = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("\nPlease enter id: \n");
            if (!scanner.hasNextInt()) {
                System.out.println("\nId can't be non-int: '"+scanner.next()+"'\n");
                continue;
            }

            id = scanner.nextInt();
            if (id < 0) {
                System.out.println("\nId can't be less than 0\n");
                continue;
            } else if (!weightTracker.idIsNotCurrentlyInList(id)) {
                System.out.println("\nThis Id is already in use\n");
                continue;
            }

            valid = true; // valid id input
        }
        return id;
    }

    public static double validateMeasurementInput(WeightTracker weightTracker, Scanner scanner) {
        double measurement = 0.00;
        boolean valid = false;
        while (!valid) {
            System.out.println("\nPlease enter measurement: \n");
            if (!scanner.hasNextDouble()) {
                System.out.println("\nMeasurement can't be non-double: '"+scanner.next()+"'\n");
                continue;
            }

            measurement = scanner.nextDouble();
            if (measurement < 0) {
                System.out.println("\nMeasurement can't be less than 0.00\n");
                continue;
            }

            valid = true; // valid id input
        }
        return measurement;
    }
}
