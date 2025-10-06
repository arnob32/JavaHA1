package assignment3;

import java.util.*;

public class IndustrialProcess {
    private String name;
    private List<Operation> operations = new ArrayList<>();

    public IndustrialProcess(String name) {
        this.name = name;
    }

    public void addOperation(Operation op) {
        operations.add(op);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Operation op : operations) total += op.calculateCost();
        return total;
    }

    public void start() {
        System.out.println("\n--- Starting Process: " + name + " ---");
        for (Operation op : operations) {
            op.execute();
            op.printCostDetails();
        }
        System.out.println("Total process cost: $" + String.format("%.2f", getTotalCost()));
    }
}
