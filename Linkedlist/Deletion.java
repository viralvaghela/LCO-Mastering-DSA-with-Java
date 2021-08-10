class Deletion 
{

    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    //inser at the end
    void append(int d)
    {
        Node new_node = new Node(d);
        Node last_node = head;
        if(head == null)
        {
            head = new_node;
            return;
        }
        while(last_node.next !=null)
        {
            last_node = last_node.next;
        }
        last_node.next=new_node;
        return;
    }

    //insert before head
    public void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    //insert after prev node
    void insertAfter(Node pre_node,int d)
    {
        if(pre_node==null)
        {
            System.out.println("Prev node Seems Null,sorry cant insert !");
            return;
        }

        Node new_node = new Node(d);
        new_node.next = pre_node.next;
        pre_node.next=new_node;
        return;
    }

    //delete front /head / first node from the list
    void deleteFirst()
    {
        //if list is empty 
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head= head.next;
    }

    //delete Last node from the list
    void deleteLast()
    {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next.next !=null)
        {
            temp = temp.next;
        }
        temp.next=null;
        return;

    }

    //delete using key
    void deleteKey(int key)
    {
        Node temp = head;
        while(temp !=null && temp.data==key)
        {
            if(key==temp.data)
            {
                System.out.println("Key Found");
                return;
            }
            
            temp=temp.next;
        }
    }

    //print Linkedlist
    void printList()
    {
        int total = 0;
        Node temp=head;
        while(temp!=null)
        {
            total++;
            System.out.println(" "+temp.data);
            temp=temp.next;
        }
        System.out.println("Total nodes:"+total);
    }

    public static void main(String[] args) {
        Deletion del = new Deletion();
        del.push(20);
        del.push(15);
        del.push(10);
        del.append(98);
        // del.insertAfter(del.head.next,18);
        // // del.delete( );
        // del.printList();
        // del.deleteFirst();
        // del.printList();
        // del.deleteLast();
        del.printList();
        del.deleteKey(220);
    }
}