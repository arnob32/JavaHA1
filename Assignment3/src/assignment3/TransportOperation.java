package assignment3;

public class TransportOperation extends Operation {
    public TransportOperation(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Executing " + name + " (Transport)...");
        for (AGV agv : agvs) agv.performTask("Move items across warehouse");
    }
}
