package firstvar;

public class OddElevator extends Elevator {
    public OddElevator(int currFloor, EleStatus status) {
        super(currFloor, status);
    }

    @Override
    public void move(int targetedFloor) {
    }

    @Override
    public void changeStatus(EleStatus newStatus) {
        this.status = newStatus;
    }
}

