package Propulsion;

public class Propulsion {
    private String IDNumber;
    private IonEngine PortEngine;
    private IonEngine StarboardEngine;
    private Hyperdrive LSEngine;
    private double CostToBuild;

    public Propulsion(IonEngine port, IonEngine starboard, Hyperdrive LS){
        this.PortEngine = port;
        this.StarboardEngine = starboard;
        this.LSEngine = LS;
        this.CostToBuild = port.getCost() + starboard.getCost() + LS.getCost();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(LSEngine.toString());
        sb.append(StarboardEngine.toString());
        sb.append(PortEngine.toString());
        return sb.toString();
    }

    public void displayPropulsionSpecs(){
        System.out.println(this.toString());
    }

    public double getCost(){
        return this.CostToBuild;
    }
}
