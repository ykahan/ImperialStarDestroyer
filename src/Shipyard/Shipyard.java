package Shipyard;

import Hull.*;
import IDGenerator.IDGenerator;
import Propulsion.Propulsion;
import Ship.StarDestroyer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import Propulsion.IonEngine;
import Propulsion.Hyperdrive;
import Armament.*;
import Ship.*;


public abstract class Shipyard {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<StarDestroyer> buildStarDestroyer(int type1Count, int type2Count, TreeMap registry) {
        ArrayList<StarDestroyer> type1s = buildShips(1, type1Count);
        ArrayList<StarDestroyer> type2s = buildShips(2, type2Count);
        ArrayList<StarDestroyer> all = new ArrayList<>();
        all.addAll(type1s);
        all.addAll(type2s);
        return all;
    }

    public ArrayList<StarDestroyer> buildShips(int type, int count) {
        ArrayList<StarDestroyer> ships = new ArrayList<>();
        for (int currentShip = 0; currentShip < count; currentShip++) {
            System.out.println("Please provide name for Type " + type + " ship.");
            String name = scanner.nextLine();
            StarDestroyer ship = null;
            if(type == 1) ship = new Type1(name);
            if(type == 2) ship = new Type2(name);
            ships.add(ship);
        }
        return ships;
    }

    public ArrayList<Armament> buildArmament(int armsCount) {
        ArrayList<Armament> arms = new ArrayList<>();
        for (int armament = 0; armament < armsCount; armament++) {
            Armament armamentCurrent = new Armament();
            arms.add(armamentCurrent);
        }
        return arms;
    }

    public ArrayList<Propulsion> buildPropulsion(int propulsionCount) {
        ArrayList<Propulsion> props = new ArrayList<>();
        for (int propNumber = 0; propNumber < propulsionCount; propNumber++) {
            IonEngine port = new IonEngine(IDGenerator.getUniqueID());
            IonEngine starboard = new IonEngine(IDGenerator.getUniqueID());
            Hyperdrive ls = new Hyperdrive(IDGenerator.getUniqueID());
            Propulsion prop = new Propulsion(port, starboard, ls);
            props.add(prop);
        }
        return props;
    }

    public ArrayList<Hull> buildHulls(int hullCount) {
        ArrayList<Hull> hulls = new ArrayList<>();
        for (int hullNumber = 0; hullNumber < hullCount; hullNumber++) {
            FwdHullSection fwd = new FwdHullSection(IDGenerator.getUniqueID());
            MidHullSection mid = new MidHullSection(IDGenerator.getUniqueID());
            AftHullSection aft = new AftHullSection(IDGenerator.getUniqueID());
            Bridge bridge = new Bridge(IDGenerator.getUniqueID());
            Hull hull = new Hull(fwd, mid, aft, bridge);
            hulls.add(hull);
        }
        return hulls;
    }
}
