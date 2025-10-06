package assignment3;

public class SortingOperation extends Operation {
    public SortingOperation(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Executing " + name + " (Sorting)...");
        for (AGV agv : agvs) agv.performTask("Sort items");
    }
}
