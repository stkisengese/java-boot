// package Observer;
import java.util.List;
import java.util.ArrayList;

public class DecimalBaseObserver implements NumericBaseObserver {
    private final List<String> events = new ArrayList<>();

    @Override
    public void updateState(int state) {
        events.add(Integer.toString(state));
    }

    @Override
    public List<String> getEvents() {
        return events;
    }
}