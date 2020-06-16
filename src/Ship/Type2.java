package Ship;
import Armament.Armament;
import Propulsion.Propulsion;
import Hull.Hull;

public class Type2 extends StarDestroyer{

    public Type2(String ShipName, Armament arm, Propulsion prop, Hull hull){
        super(ShipName, Classes.IMPERIAL_II, arm, prop, hull);
    }
}
