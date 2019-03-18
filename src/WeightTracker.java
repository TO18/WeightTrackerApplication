import java.util.LinkedHashMap;
import java.util.Map;

public class WeightTracker {
    private LinkedHashMap<Integer, WeightEntryUser> weightEntryUserHashMap = new LinkedHashMap<>();

    public boolean idIsNotCurrentlyInList(int id) {
        return !weightEntryUserHashMap.containsKey(id); // checking that it does not contain the id
    }

    public boolean idIsCurrentlyInList(int id) {
        return weightEntryUserHashMap.containsKey(id); // checking that it does not contain the id
    }

    public void addNewUser(int id) {
        weightEntryUserHashMap.put(id, new WeightEntryUser(id)); // for registering new users
    }

    public void addNewUserMeasurement(int id, double measurement) {
        if (idIsNotCurrentlyInList(id)) {
            return;
        }
        weightEntryUserHashMap.get(id).addMeasurement(measurement);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<Integer, WeightEntryUser> weuhm: weightEntryUserHashMap.entrySet()) {
            sb.append("\n" + weuhm.toString() + "\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
