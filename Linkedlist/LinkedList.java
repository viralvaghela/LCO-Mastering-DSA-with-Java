class LinkedList {

    Node head;
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


    //Print list elements
    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
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
        ll.printList();
    }
}