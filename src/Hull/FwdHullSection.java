package Hull;

public class FwdHullSection extends HullSection{

    public FwdHullSection(String id) {
        super(id, "Fwd", 1800, 400, 150, 700, 900, false);
    }

    public void checking(){
        System.out.println("Sonic the Hedgehog");
    }
}
