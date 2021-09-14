class CList {

    static Node head;

    static class Node {
        int data;
        Node next;

    }

    static Node push(int data, Node head_ref) {
        Node new_node = new Node();
        new_node.data = data;
        Node temp = head_ref;
        if (head_ref != null) {
            while (temp.next != head_ref) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head_ref;

        } else
            new_node.next = new_node;
        head_ref = new_node;

        return head_ref;
        // System.out.println("List is e");
    }

    // delete node using value
    static void delete(Node head_ref) {

    }

    // count total nodes in a list
    static void countNode(Node head_ref) {
        Node temp = head_ref;
        int counter = 0;
        do {
            counter++;
            temp = temp.next;
        } while (temp != head_ref);
        System.out.println(counter);
    }
    static Node convertToCircular(Node head)
    {
        Node temp = head;
        while(head.next!=null)
        {
            head = head.next;
        }
        head.next = temp;
        return temp;
    }

    static void print(Node head_ref) {
        Node temp = head_ref;
        if (head_ref != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head_ref);
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = push(10, head);
        head = push(20, head);
        head = push(30, head);
        // print(head);
        countNode(head);
    }
}