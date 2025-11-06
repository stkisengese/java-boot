import java.util.List;
import java.util.ArrayList;

public class Galaxy {

    private List<CelestialObject> celestialObjects;

    // default constructor
    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }

    // method to add a celestial object to the galaxy
    public void addCelestialObject(CelestialObject obj) {
        this.celestialObjects.add(obj);
    }

    // method to get all celestial objects in the galaxy
    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

}
