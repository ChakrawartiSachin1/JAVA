class Node {
    int data; // value
    Node next; // Reference to the next node

    Node(int data) {
        this.data = data;
    }
}

public class Basic_Second_LinkedList {

    public static void main(String[] args) {
        // Creating nodes with values 10, 20, 30, 40, and 50
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Establishing references between nodes to form a linked list
        a.next = b; // a -> b
        b.next = c; // b -> c
        c.next = d; // c -> d
        d.next = e; // d -> e

        // Printing some data values and their corresponding next node's data value
        System.out.println("b.data =  " + b.data + "  a.next.data = " + a.next.data);
        // Output: b.data = 20 a.next.data = 20
        // Since a.next points to b, accessing a.next.data is equivalent to accessing b.data

        System.out.println("c.data =  " + c.data + "  b.next.data = " + b.next.data);
        // Output: c.data = 30 b.next.data = 30
        // Since b.next points to c, accessing b.next.data is equivalent to accessing c.data

        System.out.println("d.data =  " + d.data + "  c.next.data = " + c.next.data);
        // Output: d.data = 40 c.next.data = 40
        // Since c.next points to d, accessing c.next.data is equivalent to accessing d.data

        System.out.println("e.data =  " + e.data + "  d.next.data = " + d.next.data);
        // Output: e.data = 50 d.next.data = null
        // Since d.next points to e and e is the last node, d.next.data is null
    }

}
