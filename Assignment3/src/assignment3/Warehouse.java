package assignment3;

import java.util.*;

public class Warehouse {
    private String name;
    private List<IndustrialProcess> processes = new ArrayList<>();

    public Warehouse(String name) {
        this.name = name;
    }

    public void addProcess(IndustrialProcess p) {
        processes.add(p);
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (IndustrialProcess p : processes) total += p.getTotalCost();
        return total;
    }

    public void simulate() {
        System.out.println("\n=== Simulating Warehouse: " + name + " ===");
        for (IndustrialProcess p : processes) p.start();
        System.out.println("\nTotal warehouse cost: $" + String.format("%.2f", calculateTotalCost()));
    }
}
