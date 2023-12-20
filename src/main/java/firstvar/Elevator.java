package firstvar;

public abstract class Elevator {
    int currFloor;
    EleStatus status;
    public Elevator (int currFloor, EleStatus status) {
        this.currFloor = currFloor;
        this.status = status;
    }

    public abstract void move(int targetedFloor);
    public abstract void changeStatus(EleStatus status);

}
