package LinkedList;

public class DoubleLdList {

    Node head;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }
}
