import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    // method to compute the mass of all objects in the galaxy
    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massMap = new HashMap<>();

        // Initialize mass map
        massMap.put("Star", 0);
        massMap.put("Planet", 0);
        massMap.put("Other", 0);

        for (CelestialObject obj : celestialObjects) {
            if (obj instanceof Star) {
                massMap.put("Star", massMap.get("Star") + obj.getMass());
            } else if (obj instanceof Planet) {
                massMap.put("Planet", massMap.get("Planet") + obj.getMass());
            } else {
                massMap.put("Other", massMap.get("Other") + obj.getMass());
            }
        }
        
        return massMap;
    }
}
