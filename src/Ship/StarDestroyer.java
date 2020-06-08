package Ship;

import Armament.Armament;
import Hull.*;
import IDGenerator.IDGenerator;
import Location.Location;
import Propulsion.Hyperdrive;
import Propulsion.IonEngine;
import Propulsion.Propulsion;

public abstract class StarDestroyer implements Maneuvers, ShipMovement, ShipCombat {
    protected static final String ShipType = "Star Destroyer";
    protected String ShipNumber;
    protected String ShipName;
    protected Classes ShipClass;
    protected int ShipCrew;
    protected double ShipCost;
    protected Hull ShipMainHull;
    protected Propulsion ShipPropulsion;
    protected Armament ShipArmament;
    protected Location ShipLocation;

    public StarDestroyer(String ShipName, Classes ShipClass) {
        this.ShipName = ShipName;
        this.ShipClass = ShipClass;
        String ShipNumber = IDGenerator.getUniqueID();

        FwdHullSection fwd = new FwdHullSection(IDGenerator.getUniqueID());
        MidHullSection mid = new MidHullSection(IDGenerator.getUniqueID());
        AftHullSection aft = new AftHullSection(IDGenerator.getUniqueID());
        Bridge bridge = new Bridge(IDGenerator.getUniqueID());
        Hull hull = new Hull(fwd, mid, aft, bridge);

        IonEngine ion1 = new IonEngine(IDGenerator.getUniqueID());
        IonEngine ion2 = new IonEngine(IDGenerator.getUniqueID());
        Hyperdrive hyper = new Hyperdrive(IDGenerator.getUniqueID());
        Propulsion prop = new Propulsion(ion1, ion2, hyper);

        Armament armament = new Armament();

        Location loc = new Location();

        double componentsCost = this.ShipArmament.getCost() + this.ShipMainHull.getCost() + this.ShipPropulsion.getCost();
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

    public void navigatesToPosition(String position) {
        System.out.println("Ship #" + ShipNumber + " is a " + ShipClass +
                " Star Destroyer and in currently traveling to " + position + ".");
    }

    public void orbitsPlanet(String planet) {
        System.out.println("Ship #" + ShipNumber + " is a " + ShipClass +
                " Star Destroyer and in currently orbiting " + planet + ".");
    }

    public void displayShipInfo() {
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
