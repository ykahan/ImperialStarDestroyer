package Main;

import Shipyard.Shipyard;
import TypeAndLocation.Type;
import TypeAndLocation.TypeLocation;
import TypeAndLocation.Location;
import Ship.StarDestroyer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, TypeLocation> registry = new TreeMap();
        registry.put("ISS-231 Strangler", new TypeLocation(Type.TYPE_I, new Location(10, 20, 30)));
        registry.put("ISS-121 Ravager", new TypeLocation(Type.TYPE_I, new Location(20, 25, 32)));
        registry.put("ISS-432 Disruptor", new TypeLocation(Type.TYPE_I, new Location(30, 30, 34)));
        registry.put("ISS-987 Devastator", new TypeLocation(Type.TYPE_I, new Location(40, 35, 36)));
        registry.put("ISS-765 Desolation", new TypeLocation(Type.TYPE_I, new Location(50, 40, 38)));
        registry.put("ISS-411 Exterminator", new TypeLocation(Type.TYPE_I, new Location(60, 45, 40)));
        registry.put("ISS-290 Razor", new TypeLocation(Type.TYPE_I, new Location(70, 50, 42)));
        registry.put("ISS-476 Spoiler", new TypeLocation(Type.TYPE_I, new Location(80, 55, 44)));
        registry.put("ISS-900 Annihilator", new TypeLocation(Type.TYPE_I, new Location(90, 60, 46)));
        registry.put("ISS-561 Havoc", new TypeLocation(Type.TYPE_II, new Location(90, 20, 10)));
        registry.put("ISS-134 Crusher", new TypeLocation(Type.TYPE_II, new Location(80, 24, 12)));
        registry.put("ISS-477 Despoiler", new TypeLocation(Type.TYPE_II, new Location(70, 30, 14)));
        registry.put("ISS-329 Ruiner", new TypeLocation(Type.TYPE_II, new Location(60, 35, 16)));
        registry.put("ISS-651 Raider", new TypeLocation(Type.TYPE_II, new Location(50, 40, 18)));
        registry.put("ISS-11 Ransacker", new TypeLocation(Type.TYPE_II, new Location(40, 45, 20)));
        registry.put("ISS-90 Wrecker", new TypeLocation(Type.TYPE_II, new Location(30, 50, 22)));
        registry.put("ISS-98 Sacker", new TypeLocation(Type.TYPE_II, new Location(20, 55, 24)));
        registry.put("ISS-200 Obliterator", new TypeLocation(Type.TYPE_II, new Location(10, 60, 26)));
        List<StarDestroyer> fleet = Shipyard.buildStarDestroyers(9, 9, registry);
        for(StarDestroyer sd : fleet){
            sd.displayShipInfo();
        }


        for(StarDestroyer sd : fleet){
            if(sd.getShipName().contains("Strangler")) sd.displayPropulsionSpecs();
            if(sd.getShipName().contains("Ravager")) sd.displayArmamentSpects();
            if(sd.getShipName().contains("Crusher")) sd.displayHullSpecs();
            if(sd.getShipName().contains("Ransacker")) sd.fireMainBatteries("Rebel Base");
            if(sd.getShipName().contains("Obliterator")) sd.fireSecondaryBatteries("X-Wing Fighters");
        }

    }
}
