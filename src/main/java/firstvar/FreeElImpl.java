package firstvar;

public class FreeElImpl implements FreeEl {
    private Node head;
    private Node tail;

    public FreeElImpl() {
        this.head = null;
        this.tail = null;
    }

    public int free() {
        if (head == null) {
            System.out.println("no elevator");
            return -1;
        } else {
            int freeElevator = head.value;
            head = head.next;
            tail.next = head;
            return freeElevator;
        }
    }

    public void addElevator(int elevator) {
        Node node = new Node(elevator);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }
}
