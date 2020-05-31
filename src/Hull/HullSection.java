package Hull;

public class HullSection {
    private String IDNumber;
    private String SectionType;
    private int CostToBuild;
    private int Length;
    private int Height;
    private int Width;
    private int Weight;
    private boolean Assembled;

    public HullSection(String id){
        this.IDNumber = id;
    }

    public void displaySectionInfo(){
        System.out.println(this.toString());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nSection Type: " + SectionType);
        sb.append("\nID Number: " + IDNumber);
        sb.append("\nCost to build: " + CostToBuild + " Palpatines");
        sb.append("\nLength: " + Length);
        sb.append("\nHeight: " + Height);
        sb.append("\nWidth: " + Width);
        sb.append("\nWeight: " + Weight + " metric tons");
        sb.append("\nAssembled: " + Assembled + "\n");
        return sb.toString();
    }
}
