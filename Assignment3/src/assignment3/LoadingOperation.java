package assignment3;

public class LoadingOperation extends Operation {
    public LoadingOperation(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Executing " + name + " (Loading)...");
        for (AGV agv : agvs) agv.performTask("Load materials");
    }
}
