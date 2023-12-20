package firstvar;

public class EvenElevator extends Elevator {
    public EvenElevator(int currFloor, EleStatus status) {
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
