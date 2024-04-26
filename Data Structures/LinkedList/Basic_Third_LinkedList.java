class Node {
    int data; // value
    Node next; // Reference to the next node

    Node(int data) {
        this.data = data;
    }
}

public class Basic_Third_LinkedList{
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

        // Iterating through the linked list to print the data values of each node
        Node temp = a; // Start from the head node
        for (int i = 0; i < 5; i++) { // Assuming there are 5 nodes in the list
            System.out.println(temp.data); // Print the data value of the current node
            temp = temp.next; // Move to the next node
        }
    }
}
