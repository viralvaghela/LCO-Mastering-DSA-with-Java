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

    public void printlist(Node node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

    public static void main(String[] args) {
        Doubly dlist = new Doubly();
        dlist.push(10);
        dlist.push(20);
        dlist.printlist(dlist.head);

    }

}
