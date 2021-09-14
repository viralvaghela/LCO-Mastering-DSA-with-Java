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
        dlist.printlist(dlist.head);
    }

}
