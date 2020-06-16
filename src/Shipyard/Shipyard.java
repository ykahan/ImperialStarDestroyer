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
        ArrayList<Armament> arms1 = buildArmament(type1Count);
        ArrayList<Armament> arms2 = buildArmament(type2Count);

        ArrayList<Propulsion> props1 = buildPropulsion(type1Count);
        ArrayList<Propulsion> props2 = buildPropulsion(type2Count);

        ArrayList<Hull> hulls1 = buildHulls(type1Count);
        ArrayList<Hull> hulls2 = buildHulls(type2Count);

        ArrayList<StarDestroyer> type1s = buildShips(1, type1Count, arms1, props1, hulls1);
        ArrayList<StarDestroyer> type2s = buildShips(2, type2Count, arms2, props2, hulls2);

        ArrayList<StarDestroyer> allShips = new ArrayList<>();
        allShips.addAll(type1s);
        allShips.addAll(type2s);

        return allShips;
    }

    public ArrayList<StarDestroyer> buildShips(int type, int count, ArrayList<Armament> arms, ArrayList<Propulsion> props,
                                               ArrayList<Hull> hulls) {
        ArrayList<StarDestroyer> ships = new ArrayList<>();
        for (int current = 0; current < count; current++) {
            System.out.println("Please provide name for Type " + type + " ship.");
            String name = scanner.nextLine();
            StarDestroyer ship = null;
            if(type == 1) ship = new Type1(name, arms.get(current), props.get(current), hulls.get(current));
            if(type == 2) ship = new Type2(name, arms.get(current), props.get(current), hulls.get(current));
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
