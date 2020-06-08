package Hull;

public abstract class HullSection {
    private String IDNumber;
    private String SectionType;
    private int CostToBuild;
    private int Length;
    private int Height;
    private int Width;
    private int Weight;
    private boolean Assembled;

    public HullSection(String id, String SectionType, int CostToBuild, int Length, int Height,
                       int Width, int Weight, boolean Assembled){
        this.IDNumber = id;
        this.SectionType = SectionType;
        this.CostToBuild = CostToBuild;
        this.Length = Length;
        this.Height = Height;
        this.Width = Width;
        this.Weight = Weight;
        this.Assembled = Assembled;
    }

    public void displaySectionInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nSection Type: " + SectionType);
        sb.append("\nID Number: " + IDNumber);
        sb.append("\nCost to build: " + CostToBuild + " Palpatines");
        sb.append("\nLength: " + Length);
        sb.append("\nHeight: " + Height);
        sb.append("\nWidth: " + Width);
        sb.append("\nWeight: " + Weight + " metric tons");
        sb.append("\nInstalled: " + Assembled + "\n");
        return sb.toString();
    }

    public int getCostToBuild() {
        return CostToBuild;
    }

    public int getWeight() {
        return Weight;
    }
}
