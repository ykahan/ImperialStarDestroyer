package Hull;

public class Superstructure extends HullSection{
    private final String SectionType = "Super";
    private final int CostToBuild = 1000;
    private final int Length = 200;
    private final int Height = 350;
    private final int Width = 600;
    private final int Weight = 300;
    private boolean Assembled = false;

    public Superstructure(String id) {
        super(id);
    }
}
