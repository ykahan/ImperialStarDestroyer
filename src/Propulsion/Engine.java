package Propulsion;

public class Engine {
    private String IDNumber;
    private String EngineType;
    private int CostToBuild;
    private int MaxThrust;
    private int Weight;
    private int FuelCapacity;
    private boolean Installed;

    public Engine(String id){
        this.IDNumber = id;
    }

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

    public int getCostToBuild() {
        return CostToBuild;
    }
}
