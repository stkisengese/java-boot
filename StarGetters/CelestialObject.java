package StarGetters;
public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;

    // defautt constructor
    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
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
    public double getX() {
        return this.x;  
    }
    public double getY() {
        return this.y;  
    }
    public double getZ() {
        return this.z;
    }  
    public String getName() {
        return this.name;
    }
    
}