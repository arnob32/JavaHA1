package assignment3;

public class Main {
    public static void main(String[] args) {
        Resource electricity = new Resource("Electricity", 100, 0.5);   // $50
        Resource labor = new Resource("Labor hours", 20, 15);           // $300
        Resource packaging = new Resource("Packaging material", 30, 2); // $60

        AGV agv1 = new AGV("A01", "Loader AGV", 12, 10);   // $120


        LoadingOperation loadOp = new LoadingOperation("Loading Operation");
        loadOp.addResource(electricity);
        loadOp.addAGV(agv1);

        TransportOperation transportOp = new TransportOperation("Transports Operation");
        transportOp.addResource(labor);


        SortingOperation sortOp = new SortingOperation("Sorting Operations");
        sortOp.addResource(packaging);
        sortOp.addAGV(agv1);
        
        

        IndustrialProcess packagingProcess = new IndustrialProcess("Packaging Processes");
        packagingProcess.addOperation(loadOp);
        packagingProcess.addOperation(sortOp);
        

        IndustrialProcess assemblyProcess = new IndustrialProcess("Assembly Processes");
        
        assemblyProcess.addOperation(transportOp);

        Warehouse warehouse = new Warehouse("Warehouse");
        
        warehouse.addProcess(packagingProcess);
 

        warehouse.simulate();
    }
}
