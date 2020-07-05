package TypeAndLocation;

public class TypeLocation {
    private Type type;
    private Location location;

    public TypeLocation(Type type, Location location){
        this.type = type;
        this.location = location;
    }

    public Type getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
