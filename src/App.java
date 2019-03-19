import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        WeightTracker weightTracker = new WeightTracker();
        // for adding new users
        int id = WeightTrackerUtil.validateIdInput(weightTracker, SingletonScanner.getScanner());
        weightTracker.addNewUser(id);

        // for adding new measurements to a user
        double measurement = WeightTrackerUtil.validateMeasurementInput(weightTracker, SingletonScanner.getScanner());
        weightTracker.addNewUserMeasurement(id, measurement);

        System.out.println(weightTracker.toString());
    }
}
