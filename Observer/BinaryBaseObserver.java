// package Observer;
import java.util.List;
import java.util.ArrayList;

public class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();


    @Override
    public void updateState(int state) {
        events.add(Integer.toBinaryString(state));
    }

    @Override
    public List<String> getEvents() {
        return events;
    }
  
}