import java.util.Date;

public class WeightEntry {
    private double measurement;
    private Date date;

    WeightEntry(double measurement) {
        this.measurement = measurement; // measurement mandatory to initialize instance
        this.date = new Date(); // initialize date upon instance creation
    }

    public String toString() {
        return "{date: "+date+", measurement: "+measurement+"}";
    }
}
