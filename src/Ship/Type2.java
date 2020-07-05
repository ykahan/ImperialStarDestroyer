package Ship;
import Armament.Armament;
import Propulsion.Propulsion;
import Hull.Hull;
import TypeAndLocation.Type;

public class Type2 extends StarDestroyer{

    public Type2(String ShipName, Armament arm, Propulsion prop, Hull hull){
        super(ShipName, Type.TYPE_II, arm, prop, hull);
    }
}
