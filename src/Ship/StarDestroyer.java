package Ship;

import Armament.Armament;
import Hull.*;
import IDGenerator.IDGenerator;
import Location.Location;
import Propulsion.Propulsion;

public abstract class StarDestroyer implements Maneuvers, ShipMovement, ShipCombat {
    protected static final String ShipType = "Star Destroyer";
    protected String ShipNumber;
    protected String ShipName;
    protected Classes ShipClass;
    protected int ShipCrew;
    protected double ShipCost;
    protected Hull ShipHull;
    protected Propulsion ShipPropulsion;
    protected Armament ShipArmament;
    protected Location ShipLocation;

    public StarDestroyer(String ShipName, Classes ShipClass, Armament arm, Propulsion prop, Hull hull) {
        this.ShipName = ShipName;
        this.ShipClass = ShipClass;
        this.ShipNumber = IDGenerator.getUniqueID();

        this.ShipHull = hull;

        this.ShipPropulsion = prop;

        this.ShipArmament = arm;

        this.ShipLocation = new Location();

        double componentsCost = this.ShipArmament.getCost() + this.ShipHull.getCost() + this.ShipPropulsion.getCost();
        double multiplier = 0;
        if (this.ShipClass.equals(Classes.IMPERIAL_II)) {
            multiplier = 1.75;
            this.ShipCrew = 9100;
        } else if (this.ShipClass.equals(Classes.IMPERIAL_I)) {
            multiplier = 1.25;
            this.ShipCrew = 7500;
        }
        this.ShipCost = multiplier * componentsCost;
    }

    public String getShipName(){
        return this.ShipName;
    }

    public void displayPropulsionSpecs(){
        this.ShipPropulsion.displayPropulsionSpecs();
    }

    public void navigatesToPosition(String position) {
        System.out.println("Ship #" + ShipNumber + " is a " + ShipClass +
                " Star Destroyer and in currently traveling to " + position + ".");
    }

    public void orbitsPlanet(String planet) {
        System.out.println("Ship #" + ShipNumber + " is a " + ShipClass +
                " Star Destroyer and in currently orbiting " + planet + ".");
    }

    public void displayShipInfo() {
        System.out.println();
        System.out.println("==========================");
        System.out.println("Name: " + this.ShipName);
        System.out.println("Class: " + this.ShipClass);
        System.out.println("Number: " + this.ShipNumber);
        System.out.println("Crew: " + this.ShipCrew);
        System.out.println("Cost: " + this.ShipCost);
        System.out.println("Location: " + this.ShipLocation.toString());
    }

    public void moveForward(){
        System.out.println(this.ShipName + " moves forward!");
    }

    public void turnToStarboard(){
        System.out.println(this.ShipName + " turns to starboard!");
    }

    public void turnToPort(){
        System.out.println(this.ShipName + " turns to port!");
    }

    public void fireMainBatteries(String tgt){
        System.out.println(this.ShipName + " is firing main weapon!");
        for(int i = 0; i < 17; i += 4){
            int min = i + 1;
            int max = i + 4;
            System.out.println("\nTurbo Laser Cannon Batteries " + min + " through " + max + " fire upon " + tgt);
        }
    }

    public void fireSecondaryBatteries(String tgt){
        System.out.println(this.ShipName + " is firing secondary weapon!");
        for(int i = 0; i < 37; i += 4){
            int min = i + 1;
            int max = i + 4;
            System.out.println("\nHeavy Ion Cannon Batteries " + min + " through " + max + " fire upon " + tgt);
        }
    }


}
