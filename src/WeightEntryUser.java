import java.util.LinkedList;

public class WeightEntryUser {
    private LinkedList<WeightEntry> weightEntryLinkedList = new LinkedList<>();
    private int id;

    WeightEntryUser(int id) {
        this.id = id;
    }

    public void plotGraph() {

    }

    public void addMeasurement(double measurement) {
        weightEntryLinkedList.add(new WeightEntry(measurement));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{id: " + id);
        for (WeightEntry we: weightEntryLinkedList) {
            sb.append(" " + we.toString() + " ");
        }
        sb.append("}");
        return sb.toString();
    }
}
