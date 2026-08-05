package LinkedList.doubleLinkedList.insertion;

class Node {
    int data;
    Node next, prev;

    Node(int x) {
        data = x;
        next = prev = null;
    }
}

public class addAtEnd {
    public static void main(String[] args) {
        // 8 <-> 3 <->2 <-> 5
        Node head = new Node(8);
        head.next = new Node(3);
        head.next.prev = head;
        head.next.next = new Node(2);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(5);
        head.next.next.next.prev = head.next.next;

        int x = 1;
        head = addatEnd(head, x);
        printData(head);

    }

    public static Node addatEnd(Node head, int x) {

        // new node created
        Node newNode = new Node(x);
        
        if (head == null) {
           head=newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;

        
        return head;

    }

    public static void printData(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("<->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
