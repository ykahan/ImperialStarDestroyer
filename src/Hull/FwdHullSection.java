package Hull;

public class FwdHullSection extends HullSection{
    private final String SectionType = "Fwd";
    private final int CostToBuild = 1800;
    private final int Length = 400;
    private final int Width = 700;
    private final int Weight = 900;
    private boolean Assembled = false;

    public FwdHullSection(String id) {
        super(id);
    }
}
