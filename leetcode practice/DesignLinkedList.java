class DesignLinkedList {

    /** Initialize your data structure here. */
    Node head;
    class Node 
    {   
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }

    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
        return 0;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node new_node = new Node(val);
        if(head == null)
        {
            head = new_node;
            return;
        }

        
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
    }

    public static void main(String[] args) {
        
        //   MyLinkedList object will be instantiated and called as such:
        DesignLinkedList obj = new DesignLinkedList();
        // int param_1 = obj.get(index);
        // obj.addAtHead(val);
        // obj.addAtTail(val);
        // obj.addAtIndex(index,val);
        // obj.deleteAtIndex(index);
    }
}


 