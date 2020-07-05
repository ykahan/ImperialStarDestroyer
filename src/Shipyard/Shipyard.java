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

        List<StarDestroyer> type1s = buildShips(Type.TYPE_I, registry);
        List<StarDestroyer> type2s = buildShips(Type.TYPE_II, registry);

        List<StarDestroyer> allShips = new ArrayList<>();
        allShips.addAll(type1s);
        allShips.addAll(type2s);

        return allShips;
    }

    public static List<StarDestroyer> buildShips(Type targetType, TreeMap<String, TypeLocation> registry) {
        List<StarDestroyer> ships = new ArrayList<>();
        Set<String> names = registry.keySet();
        for(String name: names){
            TypeLocation tl = registry.get(name);
            Type foundType = tl.getType();

            if(foundType.equals(targetType)){
                StarDestroyer ship = buildShip(targetType, name);
                setLocation(ship, tl.getLocation());
                ships.add(ship);
            }
        }
        return ships;
    }

    private static StarDestroyer buildShip(Type type, String name) {
        StarDestroyer ship = null;
        if(type.equals(Type.TYPE_I)) ship = new Type1(name, new Armament(),
                new Propulsion(new IonEngine(IDGenerator.getUniqueID()),
                        new IonEngine(IDGenerator.getUniqueID()),
                        new Hyperdrive(IDGenerator.getUniqueID())),
                new Hull(new FwdHullSection(IDGenerator.getUniqueID()),
                        new MidHullSection(IDGenerator.getUniqueID()),
                        new AftHullSection(IDGenerator.getUniqueID()),
                        new Bridge(IDGenerator.getUniqueID())));

        if(type.equals(Type.TYPE_II)) ship = new Type2(name, new Armament(),
                new Propulsion(new IonEngine(IDGenerator.getUniqueID()),
                        new IonEngine(IDGenerator.getUniqueID()),
                        new Hyperdrive(IDGenerator.getUniqueID())),
                new Hull(new FwdHullSection(IDGenerator.getUniqueID()),
                        new MidHullSection(IDGenerator.getUniqueID()),
                        new AftHullSection(IDGenerator.getUniqueID()),
                        new Bridge(IDGenerator.getUniqueID())));

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
