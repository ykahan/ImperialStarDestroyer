package Ship;

import Hull.Hull;
import Propulsion.Propulsion;
import Supporting.Location;

public class Type2 {
    private String ShipNumber;
    private static final String ShipClass = "Imperial II";
    private String ShipName;
    private int ShipCrew = 9100;
    private double ShipCost;
    private Hull ShipMainHull;
    private Propulsion ShipPropulsion;
    private Location ShipLocation;

    public Type1(String ShipNumber, String ShipName, Hull ShipMainHull, Propulsion ShipPropulsion) {
        this.ShipMainHull = ShipMainHull;
        this.ShipPropulsion = ShipPropulsion;
        this.ShipCost = 1.75 * (ShipMainHull.getCost() + ShipPropulsion.getCost() + ShipArmament.getCost());
        this.ShipName = ShipName;
        this.ShipNumber = ShipNumber;
    }
}
