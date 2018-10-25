package Domain;

public class Torus extends Shape {

    private double majorR;
    private double minorR;

    public Torus(double majorR, double minorR) {
        this.majorR = majorR;
        this.minorR = minorR;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * Math.pow(minorR, 2)) * (2 * Math.PI * majorR);
    }
}
