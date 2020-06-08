package Armament;

public class TurboLaserCannon extends Cannon{

    public TurboLaserCannon(String IDNumber){
        super(IDNumber, "Turbo Laser", 1000, 5, false);
    }

    @Override
    public void fireCannon(String tgt){
        System.out.println(CannonType + " Cannon #" + IDNumber + " fires at " + tgt);
    }
}
