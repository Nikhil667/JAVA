package LinkedList;

public class LdList {

        Node head;
        private int size;

        LdList(){
            this.size = 0;
        }

        class Node{

            int data;
            Node next;

            Node( int d ){
                this.data = d;
                this.next = null;
                size++;
            }
        }

        public void addFirst(int d){
            Node newNode = new Node(d);

            if( head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public void addLast(int d){
            Node newNode = new Node(d);

            if( head == null){
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

            if( head == null){
                System.out.println(" Empty List ");
                return;
            }

            while( currNode != null ){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }

        public void deleteFirst(){
            if( head == null){
                System.out.println(" Empty List ");
                return;
            }
            size--;
            head = head.next;
        }

        public void deleteLast(){

            if( head == null){
                System.out.println("Empty List");
                return;
            }

            size--;

            if(head.next == null){
                head = null;
                return;
            }

            Node secondLastNode = head;
            Node lastNode = head.next;

            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondLastNode = secondLastNode.next;
            }
            secondLastNode.next = null;
        }

        public int getSize(Node head){
            return size;
        }

        public void reverseList(){

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

        public Node reverseListRecursion( Node head ){

            if( head == null || head.next == null){
                return head;
            }
            Node newHead = reverseListRecursion(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        }

        public void deleteMiddleElement(Node head) {
            int size = getLength(head);
            Node prevNode = head;
            Node currNode = head.next;
            int mid = size;
                mid = mid/2;
                while( mid-1 > 0 ){
                    prevNode = currNode;
                    currNode = currNode.next;
                    mid--;
                }
                prevNode.next = currNode.next;
                currNode.next = null;


        }

        public int getLength(Node head){
            Node currNode = head;
            int count = 0;
            while( currNode  != null ){
             count++;
             currNode = currNode.next;
            }
            return count;
        }

        public static void main(String[] args) {
            LdList list = new LdList();
            list.addLast(2);
            list.addLast(7);
            list.addLast(8);
            list.printList();
            list.deleteMiddleElement(list.head);
            list.printList();

//            list.deleteFirst();
//            list.printList();
//
//            list.deleteLast();
//           list.printList();

            //System.out.println(list.getSize());

////
//            list.reverseList();
//            list.printList();
//
//            list.head = list.reverseListRecursion(list.head);
//            list.printList();


        }

}
