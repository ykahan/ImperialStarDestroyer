package Ship;

public interface ShipMovement {
    int Type_I_Move_Rate = 1;
    int Type_II_Move_Rate = 2;

    public void moveForward();
    public void turnToStarboard();
    public void turnToPort();
}
