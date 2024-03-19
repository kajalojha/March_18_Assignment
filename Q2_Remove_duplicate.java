package March_18_Assignment;
class Nodes {
    int data;
    Node next;

    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q2_Remove_duplicate {
    // Function to remove duplicate nodes from a linked list
    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next; // Skip over duplicate node
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return head;
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        // Example usage:
        Node head1 = new Node(4);
        head1.next = new Node(2);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(2);
        head1.next.next.next.next.next = new Node(2);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(1);
        head2.next.next.next = new Node(2);
        head2.next.next.next.next = new Node(2);
        head2.next.next.next.next.next = new Node(2);
        head2.next.next.next.next.next.next = new Node(7);
        head2.next.next.next.next.next.next.next = new Node(7);

        Node result1 = removeDuplicates(head1);
        Node result2 = removeDuplicates(head2);

        printLinkedList(result1);
        printLinkedList(result2);
    }
}
