package Hull;

public class Hull {
    private FwdHullSection FwdHull;
    private MidHullSection MidHull;
    private AftHullSection AftHull;
    private Superstructure Bridge;
    private int Weight;
    private double CostToBuild;

    public Hull(FwdHullSection fwdHull, MidHullSection midHull, AftHullSection aftHull, Superstructure bridge){
        this.FwdHull = fwdHull;
        this.MidHull = midHull;
        this.AftHull = aftHull;
        this.Bridge = bridge;
        this.CostToBuild = FwdHull.getCostToBuild() +
                MidHull.getCostToBuild() + AftHull.getCostToBuild()
                + Bridge.getCostToBuild();
        this.Weight = FwdHull.getWeight() + MidHull.getWeight() + AftHull.getWeight() + Bridge.getWeight();
    }

    public double getCost(){
        return this.CostToBuild;
    }

    public void displayHullSpecs(){
       this.Bridge.displaySectionInfo();
       this.FwdHull.displaySectionInfo();
       this.MidHull.displaySectionInfo();
       this.AftHull.displaySectionInfo();
    }
}
