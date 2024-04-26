class Node {
    int data; // value
    Node next; // Address of next node

    Node(int data) {
        this.data = data;
    }
}

public class Basic_First_LinkedList {
    public static void main(String[] args) {
        // Creating nodes with values 5, 6, 7, 8, and 9
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        // Establishing references between nodes to form a linked list
        a.next = b;  // a -> b 
        b.next = c;  // a -> b -> c 
        c.next = d;  // a -> b -> c -> d
        d.next = e;  // a -> b -> c -> d -> e

        // Printing values of some nodes in the linked list
        System.out.println(a.next.data);                 // Output: 6
        System.out.println(a.next.next.data);            // Output: 7
        System.out.println(a.next.next.next.data);       // Output: 8
        System.out.println(a.next.next.next.next.data);  // Output: 9
    }
}
