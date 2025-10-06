package assignment3;

public class Vehicle {
    protected String id;
    protected String type;

    public Vehicle(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public void performTask(String task) {
        System.out.println(type + " (ID: " + id + ") Tasks: " + task);
    }
}
