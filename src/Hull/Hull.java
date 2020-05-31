package Hull;

public class Hull {
    private FwdHullSection FwdHull;
    private MidHullSection MidHull;
    private AftHullSection AftHull;
    private static Superstructure Superstructure;

    public Hull(FwdHullSection fwdHull, MidHullSection midHull, AftHullSection aftHull, Superstructure superstructure){
        this.FwdHull = fwdHull;
        this.MidHull = midHull;
        this.AftHull = aftHull;
        this.Superstructure = superstructure;
    }

    public void displayHullSpecs(){
       this.getSuperstructure().displaySectionInfo();
       this.getFwdHull().displaySectionInfo();
       this.getMidHull().displaySectionInfo();
       this.getAftHull().displaySectionInfo();

    }

    public FwdHullSection getFwdHull() {
        return FwdHull;
    }

    public void setFwdHull(FwdHullSection fwdHull) {
        FwdHull = fwdHull;
    }

    public MidHullSection getMidHull() {
        return MidHull;
    }

    public void setMidHull(MidHullSection midHull) {
        MidHull = midHull;
    }

    public AftHullSection getAftHull() {
        return AftHull;
    }

    public void setAftHull(AftHullSection aftHull) {
        AftHull = aftHull;
    }

    public Superstructure getSuperstructure() {
        return Superstructure;
    }

    public void setSuperstructure(Superstructure superstructure) {
        Superstructure = superstructure;
    }
}
