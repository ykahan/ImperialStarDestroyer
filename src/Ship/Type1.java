package Ship;

public class Type1 extends StarDestroyer{

    public Type1(String ShipName) {
        super(ShipName, Classes.IMPERIAL_I );
    }

    public void moveForward() {
        System.out.println(this.ShipName + " forward!");
    }

    public void turnToStarboard() {
        System.out.println(this.ShipName + " to starboard!");
    }

    public void turnToPort() {
        System.out.println(this.ShipName + " to port!");
    }

    public void fireMainBatteries(String tgt) {
        System.out.println(this.ShipName + " firing " + tgt);
    }

    public void fireSecondaryBatteries(String tgts) {
        System.out.println(this.ShipName + " firing " + tgts);
    }
}
