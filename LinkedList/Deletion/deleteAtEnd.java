package LinkedList.Deletion;


class Node{
    int data;
    Node next;
    public Node(int x){
        data=x;
        next=null;
    }
}

public class deleteAtEnd {
    public static void main(String[] args) {
        
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        head=deleteAtEnd(head);
        printData(head);

    }

    public static Node deleteAtEnd(Node head){
        if(head==null){
            return null;
        }

       Node temp=head;
       while(temp.next.next!=null){
        temp=temp.next;

       }
       temp.next=null;
       return head;
    }
    public static void printData(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");

            }
            temp=temp.next;
        }
        System.out.println();
    }

}
