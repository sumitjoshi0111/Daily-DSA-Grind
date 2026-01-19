class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}

class LinkedListDSx
{   Node head;
    Node tail;
    int size=0;


    public void printlist(Node head)
    {
        Node temp;
        if(head==null)
        {
            System.out.println("Linked List is empty:");
            return;
        }
        else
        {   temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public void deleteAtHead()
    {
        if(head==null)
        {
            System.out.println("Liked List is empty cannot delete:");
            return;
        }
        else{
            Node temp;
            temp=head;
            head=temp.next;
            System.out.println("Deleted:"+temp.data);
            temp=null;
        }
    }

    public void addAtTail(int data)
    {
        Node temp=new Node(data);
        if(head==null)tail=head=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    public void addAtHead(int data)
    {
        Node temp=new Node(data);
        if(head==null) head=tail=temp;
        else
        {
            temp.next=head;
            head=temp;
        }
        size++;
    }





}
public class practiceLL {

    public static void main(String[] args) {

        LinkedListDSx ll= new LinkedListDSx();
        ll.deleteAtHead();
        ll.printlist(ll.head);
       ll. addAtHead(20);
       ll.printlist(ll.head);
       ll. addAtHead(50);
       ll.printlist(ll.head);
       ll.addAtTail(70);
       ll.printlist(ll.head);
       ll.addAtTail(100);
       ll.addAtTail(150);
       ll.addAtTail(170);

       ll.printlist(ll.head);


        
    }
    
}
