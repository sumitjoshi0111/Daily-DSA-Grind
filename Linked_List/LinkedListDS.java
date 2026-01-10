
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}

class Linkedlist
{
    Node head;
    Node tail;
    int size=0;


     public  void printlist(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("");


    }

    public void deleteAtHead()
    {
        if(head==null)
            {
                System.out.println("-------Linked List is Empty-----");
                return;
        
            }
        else
        {   Node temp=head;
            head=temp.next;
            System.out.println("Deleted:"+temp.data);
            temp=null;

        }
       size--;
    }

    public  void addAtHead(int val)
    {
         Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
        
    }
    public void addAtTail(int val)
    {
        //case1: head=tail=null
        //case 2: head=x tail=y;

        Node temp=new Node(val);
        if(head==null)
        {
            head=tail=temp;
        }
        else
        {   tail.next=temp;
            tail=temp;

        }
        if(head==null) tail=null;

        size++;
    } 
}
public class LinkedListDS {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();


        //delete when list is empty:
        
        //insertion: at head & tail:
        ll.addAtTail(10);ll.printlist(ll.head);
        ll.deleteAtHead();
        ll.deleteAtHead();

        ll.addAtTail(20);ll.printlist(ll.head);

        ll.addAtTail(30);ll.printlist(ll.head);

        ll.addAtTail(40);ll.printlist(ll.head);

        ll.addAtHead(80);ll.printlist(ll.head);

        //Deletion: at head and tail

        System.out.println("Deletion");

        ll.deleteAtHead();
        ll.printlist(ll.head);
        ll.deleteAtHead();
        ll.printlist(ll.head);
        System.out.println(ll.size);


           
    }
    
}
