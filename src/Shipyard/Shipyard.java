package Shipyard;

import Hull.*;
import IDGenerator.IDGenerator;
import TypeAndLocation.Location;
import Propulsion.Propulsion;
import Ship.StarDestroyer;

import java.util.*;

import Propulsion.IonEngine;
import Propulsion.Hyperdrive;
import Armament.*;
import Ship.*;
import TypeAndLocation.Type;
import TypeAndLocation.TypeLocation;


public abstract class Shipyard {
    private static Scanner scanner = new Scanner(System.in);
    public static List<StarDestroyer> buildStarDestroyers(int type1Count, int type2Count, TreeMap registry) {
        List<Armament> arms1 = buildArmament(type1Count);
        List<Armament> arms2 = buildArmament(type2Count);

        List<Propulsion> props1 = buildPropulsion(type1Count);
        List<Propulsion> props2 = buildPropulsion(type2Count);

        List<Hull> hulls1 = buildHulls(type1Count);
        List<Hull> hulls2 = buildHulls(type2Count);

        List<StarDestroyer> type1s = buildShips(Type.TYPE_I, arms1, props1, hulls1, registry);
        List<StarDestroyer> type2s = buildShips(Type.TYPE_II, arms2, props2, hulls2, registry);

        List<StarDestroyer> allShips = new ArrayList<>();
        allShips.addAll(type1s);
        allShips.addAll(type2s);

        return allShips;
    }

    public static List<StarDestroyer> buildShips(Type targetType, List<Armament> arms, List<Propulsion> props,
                                               List<Hull> hulls, TreeMap<String, TypeLocation> registry) {
        List<StarDestroyer> ships = new ArrayList<>();
        Set<String> names = registry.keySet();
        int count = 0;
        for(String name: names){
            TypeLocation tl = registry.get(name);
            Type foundType = tl.getType();

            if(foundType.equals(targetType)){
                StarDestroyer ship = buildShip(targetType, arms, props, hulls, count, name);
                count++;
                setLocation(ship, tl.getLocation());
                ships.add(ship);
            }
        }
        return ships;
    }

    private static StarDestroyer buildShip(Type type, List<Armament> arms, List<Propulsion> props,
                                           List<Hull> hulls, int index, String name) {
        StarDestroyer ship = null;
        if(type.equals(Type.TYPE_I)) ship = new Type1(name, arms.get(index), props.get(index), hulls.get(index));
        if(type.equals(Type.TYPE_II)) ship = new Type2(name, arms.get(index), props.get(index), hulls.get(index));
        return ship;
    }

    private static String getNameFromUser(int type) {
        System.out.println("Please provide name for Type " + type + " ship.");
        return scanner.nextLine();
    }

    private static void setLocation(StarDestroyer ship, Location location){
        ship.changeX(location.getX());
        ship.changeY(location.getY());
        ship.changeZ(location.getZ());
    }

    private static void setLocation(String name, StarDestroyer ship) {
        System.out.println("Please provide x value for location of the " + name);
        String x = scanner.nextLine();
        int xInt = Integer.parseInt(x);
        System.out.println("Please provide y value for location of the " + name);
        String y = scanner.nextLine();
        int yInt = Integer.parseInt(y);
        System.out.println("Please provide z value for location of the " + name);
        String z = scanner.nextLine();
        Integer zInt = Integer.parseInt(z);
        ship.changeX(xInt);
        ship.changeY(yInt);
        ship.changeZ(zInt);
    }

    public static ArrayList<Armament> buildArmament(int armsCount) {
        ArrayList<Armament> arms = new ArrayList<>();
        for (int armament = 0; armament < armsCount; armament++) {
            Armament armamentCurrent = new Armament();
            arms.add(armamentCurrent);
        }
        return arms;
    }

    public static ArrayList<Propulsion> buildPropulsion(int propulsionCount) {
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

    public static ArrayList<Hull> buildHulls(int hullCount) {
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
