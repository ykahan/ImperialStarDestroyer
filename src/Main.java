import Ship.StarDestroyer;
import Shipyard.Shipyard;

import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap registry = new TreeMap();
        ArrayList<StarDestroyer> fleet = Shipyard.buildStarDestroyers(9, 9, registry);
        for(StarDestroyer sd : fleet){
            sd.displayShipInfo();
        }
        for(StarDestroyer sd : fleet){
            if(sd.getShipName().contains("Strangler")) sd.displayPropulsionSpecs();
        }
    }
}
