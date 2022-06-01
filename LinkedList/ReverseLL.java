package LinkedList;

public class ReverseLL {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void addLast( int data ){
        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            return;
        }

        Node currNode = head;
        while( currNode.next != null ){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        if( head == null ){
            System.out.println("Empty List");
        }
        while( currNode != null ){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print(" NULL");
    }

    public void revLinkList(){
        if( head == null || head.next == null ){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while( currNode != null ){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        ReverseLL l = new ReverseLL();
        l.addLast(5);
        l.addLast(6);
        l.addLast(7);
        l.printList();

        l.revLinkList();
        l.printList();
    }
}
