package Ship;
import Armament.Armament;
import Hull.Hull;
import Propulsion.Propulsion;

public class Type1 extends StarDestroyer{

    public Type1(String ShipName, Armament arm, Propulsion prop, Hull hull) {
        super(ShipName, Classes.IMPERIAL_I , arm, prop, hull);
    }
}
