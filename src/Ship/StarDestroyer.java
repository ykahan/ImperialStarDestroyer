package Ship;

import Armament.Armament;
import Hull.*;
import IDGenerator.IDGenerator;
import TypeAndLocation.Location;
import Propulsion.Propulsion;
import TypeAndLocation.Type;

public abstract class StarDestroyer implements Maneuvers, ShipMovement, ShipCombat {
    protected static final String ShipType = "Star Destroyer";
    protected String ShipNumber;
    protected String ShipName;
    protected Type type;
    protected int ShipCrew;
    protected double ShipCost;
    protected Hull ShipHull;
    protected Propulsion ShipPropulsion;
    protected Armament ShipArmament;
    protected Location ShipLocation;

    public StarDestroyer(String ShipName, Type type, Armament arm, Propulsion prop, Hull hull) {
        this.ShipName = ShipName;
        this.type = type;
        this.ShipNumber = IDGenerator.getUniqueID();

        this.ShipHull = hull;

        this.ShipPropulsion = prop;

        this.ShipArmament = arm;

        this.ShipLocation = new Location();

        double componentsCost = this.ShipArmament.getCost() + this.ShipHull.getCost() + this.ShipPropulsion.getCost();
        double multiplier = 0;
        if (this.type.equals(Type.TYPE_II)) {
            multiplier = 1.75;
            this.ShipCrew = 9100;
        } else if (this.type.equals(Type.TYPE_II)) {
            multiplier = 1.25;
            this.ShipCrew = 7500;
        }
        this.ShipCost = multiplier * componentsCost;
    }

    public void changeX(int x){
        this.ShipLocation.changeX(x);
    }

    public void changeY(int y){
        this.ShipLocation.changeY(y);
    }

    public void changeZ(int z){
        this.ShipLocation.changeZ(z);
    }

    public String getShipName(){
        return this.ShipName;
    }

    public void displayIntro(){
        System.out.println("======================");
        System.out.println(getShipName());
    }

    public void displayPropulsionSpecs(){
        displayIntro();
        this.ShipPropulsion.displayPropulsionSpecs();
    }

    public void displayArmamentSpects(){
        displayIntro();
        this.ShipArmament.displayArmamentSpecs();
    }

    public void displayHullSpecs(){
        displayIntro();
        this.ShipHull.displayHullSpecs();
    }

    public void navigatesToPosition(String position) {
        System.out.println("Ship #" + ShipNumber + " is a " + this.type +
                " Star Destroyer and in currently traveling to " + position + ".");
    }

    public void orbitsPlanet(String planet) {
        System.out.println("Ship #" + ShipNumber + " is a " + this.type +
                " Star Destroyer and in currently orbiting " + planet + ".");
    }

    public void displayShipInfo() {
        System.out.println();
        System.out.println("==========================");
        System.out.println("Name: " + this.ShipName);
        System.out.println("Class: " + this.type);
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
        System.out.println("======================");
        System.out.println(this.ShipName + " is firing main weapon!");
        for(int i = 0; i < 17; i += 4){
            int min = i + 1;
            int max = i + 4;
            System.out.println("\nTurbo Laser Cannon Batteries " + min + " through " + max + " fire upon " + tgt);
        }
    }

    public void fireSecondaryBatteries(String tgt){
        System.out.println("======================");
        System.out.println(this.ShipName + " is firing secondary weapon!");
        for(int i = 0; i < 37; i += 4){
            int min = i + 1;
            int max = i + 4;
            System.out.println("\nHeavy Ion Cannon Batteries " + min + " through " + max + " fire upon " + tgt);
        }
    }


}
