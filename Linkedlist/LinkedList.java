class LinkedList {

    static Node head;
    class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

    }
    // Push - insert before the head node
    public void push(int val)
    {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }
    
    // insertAt - insert after pre node
    public void insertAt(Node prev_node,int d)
    {
        if(prev_node == null)
        {
            System.out.println("Prev node can not be null");
            return;
        }

        Node new_node = new Node(d);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    //Append - insert at the end 
    public void append(int d ){
        Node new_node = new Node(d);
        if(head ==null)
        {
            head = new_node;
            return;
        }
        else {
            new_node.next = null;

            Node temp=head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
            return;
        }
    }

    //reverse linkedlist
    Node reverseLinkedlist(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;

        while(current!=null)
        {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        node = prev;
        return node;
        
    }

    //delete at First 
    public void deleteFirst()
    {
        
    }

    //Print list elements
    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        //create object of LinkedList
        LinkedList ll = new LinkedList();
        ll.push(10);
        ll.push(15);
        ll.push(25);
        ll.push(1);
        ll.append(700);
        ll.append(800);
        
        
        System.out.println("Printing original list:");
        ll.printList();



        System.out.println("Reverse List:");
        
        head = ll.reverseLinkedlist(head);
        ll.printList();
        // revlist = revlist.reverseLinkedlist(revlist);
    }
}