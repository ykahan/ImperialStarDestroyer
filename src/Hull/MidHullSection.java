package Hull;

public class MidHullSection extends HullSection{
    private final String SectionType = "Mid";
    private final int CostToBuild = 2100;
    private final int Length = 700;
    private final int Height = 190;
    private final int Width = 700;
    private final int Weight = 1100;
    private boolean Assembled = false;

    public MidHullSection(String id) {
        super(id);
    }
}
