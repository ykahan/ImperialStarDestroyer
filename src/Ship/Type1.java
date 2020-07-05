package Ship;
import Armament.Armament;
import Hull.Hull;
import Propulsion.Propulsion;
import TypeAndLocation.Type;

public class Type1 extends StarDestroyer{

    public Type1(String ShipName, Armament arm, Propulsion prop, Hull hull) {
        super(ShipName, Type.Imperial_Class_1_Star_Destroyer, arm, prop, hull);
    }
}
