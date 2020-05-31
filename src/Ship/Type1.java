package Ship;

import Hull.Hull;
import Propulsion.Propulsion;
import Supporting.Location;

public class Type1 extends StarDestroyer {
    private String ShipNumber;
    private static final String ShipClass = "Imperial I";
    private String ShipName;
    private int ShipCrew = 7200;
    private double ShipCost;
    private Hull ShipMainHull;
    private Propulsion ShipPropulsion;
    private Location ShipLocation;

    public Type1(String ShipNumber, String ShipName, Hull ShipMainHull, Propulsion ShipPropulsion) {
        this.ShipMainHull = ShipMainHull;
        this.ShipPropulsion = ShipPropulsion;
        this.ShipCost = 1.25 * (ShipMainHull.getCost() + ShipPropulsion.getCost() + ShipArmament.getCost());
        this.ShipName = ShipName;
        this.ShipNumber = ShipNumber;
    }

    public void moveForward() {
        System.out.println(this.ShipName + " forward!");
    }

    public void turnToStarboard(){
        System.out.println(this.ShipName + " to starboard!");
    }

    public void turnToPort(){
        System.out.println(this.ShipName + " to port!");
    }

    public void fireMainBatteries(String tgt){
        System.out.println(this.ShipName + " firing " + tgt);
    }

    public void fireSecondaryBatteries(String tgts){
        System.out.println(this.ShipName + " firing " + tgts);
    }
}
