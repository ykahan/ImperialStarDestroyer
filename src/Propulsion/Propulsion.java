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
        this.CostToBuild = port.getCostToBuild() + starboard.getCostToBuild() + LS.getCostToBuild();
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
}
