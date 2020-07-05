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

    public static List<StarDestroyer> buildShips(TreeMap<String, TypeLocation> registry) {
        List<StarDestroyer> ships = new ArrayList<>();
        Set<String> names = registry.keySet();
        for (String name : names) {
            TypeLocation tl = registry.get(name);
            Type type = tl.getType();
            Location loc = tl.getLocation();

            ships.add(buildShip(type, name, loc));
        }
        return ships;
    }

    private static StarDestroyer buildShip(Type type, String name, Location loc) {
        StarDestroyer ship = null;

        Propulsion prop =
                new Propulsion(
                        new IonEngine(),
                        new IonEngine(),
                        new Hyperdrive()
                );

        Hull hull =
                new Hull(
                        new FwdHullSection(),
                        new MidHullSection(),
                        new AftHullSection(),
                        new Bridge()
                );

        Armament armament = new Armament();

        if (type.equals(Type.TYPE_I)) ship = new Type1(name, armament, prop, hull);
        if (type.equals(Type.TYPE_II)) ship = new Type2(name, armament, prop, hull);
        setLocation(ship, loc);

        return ship;
    }

    private static String getNameFromUser(int type) {
        System.out.println("Please provide name for Type " + type + " ship.");
        return scanner.nextLine();
    }

    private static void setLocation(StarDestroyer ship, Location location) {
        ship.changeX(location.getX());
        ship.changeY(location.getY());
        ship.changeZ(location.getZ());
    }

    private static void setLocation(String name, StarDestroyer ship) {
        System.out.println("Please provide x value for location of the " + name);
        String x = scanner.nextLine();

        System.out.println("Please provide y value for location of the " + name);
        String y = scanner.nextLine();

        System.out.println("Please provide z value for location of the " + name);
        String z = scanner.nextLine();

        int xInt = Integer.parseInt(x);
        int yInt = Integer.parseInt(y);
        int zInt = Integer.parseInt(z);

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
}
