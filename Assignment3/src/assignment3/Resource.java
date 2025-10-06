package assignment3;

public class Resource {
    protected String name;
    protected double quantity;
    protected double costPerUnit;

    public Resource(String name, double quantity, double costPerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.costPerUnit = costPerUnit;
    }

    public double getCost() {
        return quantity * costPerUnit;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " × " + costPerUnit + ") = $" + String.format("%.2f", getCost());
    }
}
