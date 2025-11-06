import java.util.Objects;

public class CelestialObject {

     // Public constant for AU to KM conversion
    public static final double KM_IN_ONE_AU = 150000000.0;

    private double x;
    private double y;
    private double z;
    private String name;

    // defautt constructor
    public CelestialObject() {
        this.name = "Soleil";
    }

    // parameterized constructor
    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // getter methods
    public double getX() { return this.x; }
    public double getY() { return this.y; }
    public double getZ() { return this.z; }  
    public String getName() { return this.name; }

    // Setter methods
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; } 
    public void setName(String name) { this.name = name; }

     // Static method to compute distance between two celestial objects in AU
    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double dx = obj2.getX() - obj1.getX();
        double dy = obj2.getY() - obj1.getY();
        double dz = obj2.getZ() - obj1.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    
    // Static method to compute distance between two celestial objects in kilometers
    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {
        double distanceAu = getDistanceBetween(obj1, obj2);
        return distanceAu * KM_IN_ONE_AU;
    }

     // toString method
    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CelestialObject other = (CelestialObject) obj;

        return Double.compare(other.x, x) == 0 &&
               Double.compare(other.y, y) == 0 &&
               Double.compare(other.z, z) == 0 &&
               Objects.equals(name, other.name);
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z);
    }
}