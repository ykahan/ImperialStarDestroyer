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
        System.out.println(this.FwdHull.toString());
        System.out.println(this.MidHull.toString());
        System.out.println(this.AftHull.toString());
        System.out.println(this.Superstructure.toString());

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

    public Hull.Superstructure getSuperstructure() {
        return Superstructure;
    }

    public void setSuperstructure(Superstructure superstructure) {
        Superstructure = superstructure;
    }
}
