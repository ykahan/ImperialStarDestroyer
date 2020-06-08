package Armament;

public abstract class Cannon {
    protected String IDNumber;
    protected String CannonType;
    protected int MaxRange;
    protected int CostToBuild;
    protected boolean Installed;

    public Cannon(String IDNumber, String CannonType, int MaxRange, int CostToBuild, boolean Installed){
        this. IDNumber = IDNumber;
        this.CannonType = CannonType;
        this.MaxRange = MaxRange;
        this.CostToBuild = CostToBuild;
        this.Installed = Installed;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nCannon Type: " + CannonType);
        sb.append("\nID Number: " + IDNumber);
        sb.append("\nMaximum range: " + MaxRange + " light seconds");
        sb.append("\nCost to builder: " + CostToBuild + " Palpatines");
        sb.append("'nAssembled: " + Installed);
        return sb.toString();
    }

    public void displayCannonInfo(){
        System.out.println(this.toString());
    }

    public int getCost(){
        return CostToBuild;
    }

    public abstract void fireCannon(String tgt);
}
