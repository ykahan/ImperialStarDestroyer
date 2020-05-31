package Propulsion;

public class Hyperdrive extends Engine{
    private final String EngineType = "Hyperdrive";
    private final int CostToBuild = 175;
    private final int MaxThrust = 19000;
    private final int Weight = 200;
    private final int FuelCapacity = 975;
    private boolean Installed = false;

    public Hyperdrive(String id) {
        super(id);
    }
}
