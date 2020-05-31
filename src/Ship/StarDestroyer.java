package Ship;

import Armament.Armament;
import Hull.Hull;
import Propulsion.Propulsion;
import Supporting.Location;

public abstract class StarDestroyer {
    private static final String ShipType = "Star Destroyer";
    private String ShipNumber;
    private String ShipName;
    private String ShipClass;
    private int ShipCrew;
    private double ShipCost;
    private Hull ShipMainHull;
    private Propulsion ShipPropulsion;
    private Armament ShipArmament;
    private Location ShipLocation;

    public StarDestroyer(String ShipNumber, String ShipName, String ShipClass, int ShipCrew, Hull ShipMainHull, Propulsion ShipPropulsion, Armament ShipArmament, Location ShipLocation) {
        this.ShipNumber = ShipNumber;
        this.ShipName = ShipName;
        this.ShipClass = ShipClass;
        this.ShipCrew = ShipCrew;
        this.ShipMainHull = ShipMainHull;
        this.ShipPropulsion = ShipPropulsion;
        this.ShipLocation = ShipLocation;
    }

    public void displayShipInfo() {
        System.out.println("Name: " + this.ShipName);
        System.out.println("Class: " + this.ShipClass);
        System.out.println("Number: " + this.ShipNumber);
        System.out.println("Crew: " + this.ShipCrew);
        System.out.println("Cost: " + this.ShipCost);
        System.out.println("Location: " + this.ShipLocation.toString());
    }

    public abstract void moveForward();

    public abstract void turnToStarboard();

    public abstract void turnToPort();

    public abstract void fireMainBatteries(String tgt);

    public abstract void fireSecondaryBatteries(String tgts);



}
