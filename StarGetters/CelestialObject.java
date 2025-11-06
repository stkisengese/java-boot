public class CelestialObject {
    private double x;
    private double y;
    private double z;
    private String name;

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

    // Setter methods
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    } 
    public void setName(String name) {
        this.name = name;
    }
    
}