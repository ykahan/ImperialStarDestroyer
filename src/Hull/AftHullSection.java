package Hull;

public class AftHullSection extends HullSection{
    private final String SectionType = "Aft";
    private final int CostToBuild = 2800;
    private final int Length = 500;
    private final int Height = 130;
    private final int Width = 570;
    private final int Weight = 1900;
    private boolean Assembled = false;

    public AftHullSection(String id) {
        super(id);
    }
}
