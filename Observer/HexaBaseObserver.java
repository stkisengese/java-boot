// package Observer;
import java.util.List;
import java.util.ArrayList;

public class HexaBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();

    @Override
    public void updateState(int state) {
        events.add(Integer.toHexString(state));
    }

    @Override
    public java.util.List<String> getEvents() {
        return events;
    }
}