class Doubly {

    static Node head;

    public class Node {
        int data;
        Node pre;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void push(int data) {
        Node new_node = new Node(data);

        new_node.pre = null;
        new_node.next = head;

        if (head != null) {
            head.pre = new_node;
        }
        head = new_node;

    }

    // insert between
    public void insertAfter(Node pre_node, int data) {
        Node new_Node = new Node(data);
        if (pre_node == null) {
            System.out.println("Previous node can not be null");
            return;
        }
        new_Node.next = pre_node.next;
        pre_node.next.pre = new_Node;

        new_Node.pre = pre_node;
        pre_node.next = new_Node;
    }

    // insert at the last
    public void inserAtLast(int data) {
        if (head == null) {
            System.out.println("List is empty,cant insert ");
            return;
        }
        Node temp = head;
        do {
            temp = temp.next;
        } while (temp.next != null);

        Node new_node = new Node(data);
        new_node.next = null;
        temp.next = new_node;
        new_node.pre = temp;

    }

    // delete using key/data
    void delete(int data) {
        // if its first node
        if (head.data == data) {
            head = head.next;
            head.pre = null;
            return;
        }
        Node temp = head;
        do {
            temp = temp.next;
        } while (temp.data != data);

        temp.pre.next = temp.next;
        temp.next.pre = temp.pre;
        return;

    }

    public void printlist(Node node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

    public static void main(String[] args) {
        Doubly dlist = new Doubly();
        dlist.push(40);
        dlist.push(30);
        dlist.push(20);
        dlist.push(10);
        // dlist.printlist(dlist.head);
        dlist.insertAfter(head.next.next, 35);
        // dlist.printlist(dlist.head);
        dlist.inserAtLast(99);
        // dlist.printlist(dlist.head);
        dlist.delete(40);
        // dlist.printlist(dlist.head);
        dlist.delete(10);
        dlist.printlist(dlist.head);
    }

}
