package assignment3;

import java.util.*;

public abstract class Operation {
    protected String name;
    protected List<Resource> resources = new ArrayList<>();
    protected List<AGV> agvs = new ArrayList<>();

    public Operation(String name) {
        this.name = name;
    }

    public void addResource(Resource r) {
        resources.add(r);
    }

    public void addAGV(AGV a) {
        agvs.add(a);
    }

    public double calculateCost() {
        double total = 0.0;
        for (Resource r : resources) total += r.getCost();
        for (AGV a : agvs) total += a.getCost();
        return total;
    }

    public abstract void execute();

    public void printCostDetails() {
        System.out.println("  Operation: " + name);
        for (Resource r : resources) System.out.println("    Resource -> " + r);
        for (AGV a : agvs) System.out.println("    AGV -> " + a);
        System.out.println("    Operation cost = $" + String.format("%.2f", calculateCost()));
    }
}
