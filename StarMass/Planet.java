import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    // default constructor
    public Planet() {
        super();
        this.centerStar = new Star();
    }

    // parameterized constructor
    public Planet(String name, double x, double y, double z, Star centerStar,  int mass) {
        super(name, x, y, z, mass); // call to CelestialObject parameterized constructor
        this.centerStar = centerStar;
    }

    // public getter and setter for centerStar
    public Star getCenterStar() { return this.centerStar; }
    public void setCenterStar(Star centerStar) { this.centerStar = centerStar; }

    // Override toString
    @Override
    public String toString() {
        double distanceWithCenterStar = CelestialObject.getDistanceBetween(this, centerStar);
        return String.format("%s circles around %s at the %.3f AU", 
                           getName(), centerStar.getName(), distanceWithCenterStar);
    }


    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Planet planet = (Planet) obj;
        // return centerStar != null ? centerStar.equals(planet.centerStar) : planet.centerStar == null;
        return Objects.equals(centerStar, planet.centerStar);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centerStar);
    }
}

