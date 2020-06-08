package Propulsion;

public abstract class Engine {
    private String IDNumber;
    private String EngineType;
    private double CostToBuild;
    private int MaxThrust;
    private int Weight;
    private int FuelCapacity;
    private boolean Installed;

    public Engine(String id, int CostToBuild, int MaxThrust, int Weight, int FuelCapacity, boolean Installed){
        this.IDNumber = id;
        this.CostToBuild = CostToBuild;
        this.MaxThrust = MaxThrust;
        this.Weight = Weight;
        this.FuelCapacity = FuelCapacity;
        this.Installed = Installed;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nEngine Type: " + EngineType);
        sb.append("\nID Number: " + IDNumber);
        sb.append("\nCost to build: " + CostToBuild + " Palpatines");
        sb.append("\nMaximum Thrust: " + MaxThrust + " Newtons per second");
        sb.append("\nWeight: " + Weight + " metric tons");
        sb.append("\nFuel Capacity: " + FuelCapacity + " metric tons");
        sb.append("\nInstalled: " + Installed + "\n");
        return sb.toString();
    }

    public void displayEngineInfo(){
        System.out.println(this.toString());
    }

    public double getCost(){
        return this.CostToBuild;
    }
}
