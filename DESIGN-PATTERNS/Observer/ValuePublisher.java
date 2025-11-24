// package Observer;
import java.util.List;
import java.util.ArrayList;

public class ValuePublisher {
    private List<NumericBaseObserver> observers = new ArrayList<>();

    public void updateState(int newValue) {
        for (NumericBaseObserver observer : observers) {
            observer.updateState(newValue);
        }
    }

    void subscribe(NumericBaseObserver observer) {
        observers.add(observer);
    }
    void unsubscribe(NumericBaseObserver observer) {
        observers.remove(observer);
    }
   
}