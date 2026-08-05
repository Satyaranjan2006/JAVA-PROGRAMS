package LinkedList;

class Node{
    int data;
    //here next contains the reference of the value.so its datatype is Node
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class specificIndex {
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);

        //now take variable
        int x=1;
        //now run function
        head=insertAtFront(head,3,x);

        printdata(head);

    }

    public static Node insertAtFront(Node head,int pos,int x){
       if (pos < 1)
            return head;

        // head will change if pos=1
        if (pos == 1) {
            Node newNode = new Node(x);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        // Traverse to the node that will be
        // present just before the new node
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // If position is greater than the
        // number of nodes
        if (curr == null)
            return head;

        Node newNode = new Node(x);

        // update the next pointers
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
        

    }
     //printing the data
    public static void printdata(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println( );

    }
}
