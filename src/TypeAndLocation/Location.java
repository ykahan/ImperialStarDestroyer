package TypeAndLocation;

public class Location {
    private int x;
    private int y;
    private int z;

    public Location(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Location(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }

    public void changeX(int xOffset){
        this.x += xOffset;
    }

    public void changeY(int yOffset){
        this.y += yOffset;
    }

    public void changeZ(int zOffset){
        this.z += zOffset;
    }

    public void changeXY(int xOffset, int yOffset){
        changeX(xOffset);
        changeY(yOffset);
    }

    public void changeXZ(int xOffset, int zOffset){
        changeX(xOffset);
        changeZ(zOffset);
    }

    public void changeYZ(int yOffset, int zOffset){
        changeY(yOffset);
        changeZ(zOffset);
    }

    public void changeXYV(int xOffset, int yOffset, int zOffset){
        changeX(xOffset);
        changeY(yOffset);
        changeZ(zOffset);
    }

    public void newX(int x){
        int xOffset = this.x - x;
        changeX(xOffset);
    }

    public void newY(int y){
        int yOffset = this.y - y;
        changeY(yOffset);
    }

    public void newZ(int z){
        int zOffset = this.z - z;
        changeZ(zOffset);
    }

    public void newXY(int x, int y){
        newX(x);
        newY(y);
    }

    public void newXZ(int x, int z){
        newX(x);
        newZ(z);
    }

    public void newYZ(int y, int z){
        newY(y);
        newZ(z);
    }

    public void newXYZ(int x, int y, int z){
        newX(x);
        newY(y);
        newZ(z);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Location is as follows:");
        sb.append("\nX coordinate: " + x);
        sb.append("\nY coordinate: " + y);
        sb.append("\nZ coordinate: " + z);
        return sb.toString();
    }

    public void displayLocation(){
        System.out.println(this.toString());
    }
}
