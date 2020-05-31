package Propulsion;

public class IonEngine extends Engine{
    private final String EngineType = "Ion";
    private final int CostToBuild = 25;
    private final int MaxThrust = 2000;
    private final int Weight = 135;
    private final int FuelCapacity = 800;
    private boolean Installed = false;

    public IonEngine(String id) {
        super(id);
    }
}
