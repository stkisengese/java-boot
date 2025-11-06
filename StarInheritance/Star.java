package StarInheritance;

public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        super(); // call to CelestialObject default constructor
       // this.magnitude = 0.0; it's ok to leave it uninitialized, defaults to 0.0
    }

    // public getter for magnitude
    public double getMagnitude() {
        return this.magnitude;
    }
    // public setter for magnitude
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}
