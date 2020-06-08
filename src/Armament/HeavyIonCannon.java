package Armament;

public class HeavyIonCannon extends Cannon{

    public HeavyIonCannon(String IDNumber){
        super(IDNumber, "Heavy Ion", 1000, 5, false);
    }

    @Override
    public void fireCannon(String tgt){
        System.out.println(CannonType + " Cannon #" + IDNumber + " fires at " + tgt);
    }
}
