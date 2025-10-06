package assignment3;

public class AGV extends Vehicle {
    private double hourlyCost;
    private double hoursUsed;

    public AGV(String id, String type, double hourlyCost, double hoursUsed) {
        super(id, type);
        this.hourlyCost = hourlyCost;
        this.hoursUsed = hoursUsed;
    }

    public double getCost() {
        return hourlyCost * hoursUsed;
    }

    @Override
    public String toString() {
        return type + " (ID: " + id + ") cost = $" + String.format("%.2f", getCost());
    }
}
