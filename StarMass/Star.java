import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    // default constructor
    public Star() {
        super(); // call to CelestialObject default constructor
    }

    // parameterized constructor
    public Star(String name, double x, double y, double z, double magnitude, int mass) {
        super(name, x, y, z, mass); // call to CelestialObject parameterized constructor
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

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        
        Star star = (Star) obj;
        return Double.compare(star.magnitude, magnitude) == 0;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), magnitude);
    }
}
