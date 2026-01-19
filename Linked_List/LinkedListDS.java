
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

    public void delete(int idx)
    {
        if(idx<0 ||idx>=size ) 
        {
            System.out.println("Invalid");return;
        }
        if(idx==0)
        {
            deleteAtHead();
            
        }
        Node temp=head;
        for(int i=1;i<idx;i++)
        {
            temp=temp.next;

        }

        temp.next=temp.next.next;
        if(idx==size-1) tail=temp;
        size--;
    }
    public void insert(int idx,int val)
    {
        if(idx<0 ||idx>size ) 
        {
            System.out.println("Invalid");return;
        }
        if(idx==0)addAtHead(val);
        else if(idx==size) addAtTail(val);
        else
        {
            Node nw =new Node(val);
            Node temp=head;
            for(int i=1;i<idx;i++)
            {
                temp=temp.next;
                
            }
            nw.next=temp.next;
                temp.next=nw;
            size++;
        }
    }
    public int search(int val)
    {   Node temp=head;
        int idx=0;
        if(head==null) return -1;
        while(temp!=null)
        {   if(temp.data==val)return idx;
            temp=temp.next;idx++;
        }
        return -1;
    }
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
        ll.addAtHead(40);
        ll.addAtHead(50);
        ll.addAtTail(90);
        ll.printlist(ll.head);
        System.out.println(ll.search(100));
        ll.insert(3,60);
        ll.printlist(ll.head);
        ll.delete(2);
        ll.printlist(ll.head);
        int a=(5+1)/2;
        int b=(4+0)/2;
        System.out.println(a);
        System.out.println(b);

           
    }
    
}
