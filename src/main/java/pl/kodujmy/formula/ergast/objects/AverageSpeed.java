package pl.kodujmy.formula.ergast.objects;

public class AverageSpeed {
    private String units;
    private double speed;

    public AverageSpeed(String units, double speed) {
        this.units = units;
        this.speed = speed;
    }

    public String getUnits() {
        return units;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "AverageSpeed{" +
                "units='" + units + '\'' +
                ", speed=" + speed +
                '}';
    }
}
