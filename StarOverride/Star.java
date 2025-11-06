package StarOverride;
public class Star extends CelestialObject {
    private double magnitude;

    // default constructor
    public Star() {
        super(); // call to CelestialObject default constructor
    }

    // parameterized constructor
    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z); // call to CelestialObject parameterized constructor
        this.magnitude = magnitude;
    }

    // public getter and setter for magnitude
    public double getMagnitude() { return this.magnitude; }
    public void setMagnitude(double magnitude) { this.magnitude = magnitude; }


    // Override toString
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", getName(), magnitude);
    }
}
