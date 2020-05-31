package Propulsion;

public class Propulsion {
    private String IDNumber;
    private IonEngine PortEngine;
    private IonEngine StarboardEngine;
    private Hyperdrive LSEngine;
    private int CostToBuild;

    public Propulsion(IonEngine port, IonEngine starboard, Hyperdrive LS){
        this.PortEngine = port;
        this.StarboardEngine = starboard;
        this.LSEngine = LS;
        int cost1 = port.getCostToBuild();
        int cost2 = starboard.getCostToBuild();
        int cost3 = LS.getCostToBuild();
        this.CostToBuild = cost1 + cost2 + cost3;
    }

    public String toString(){
        return this.LSEngine.toString() + this.StarboardEngine.toString() + this.PortEngine.toString();
    }

    public void displayPropulsionSpecs(){
        System.out.println(this.toString());
    }
}
