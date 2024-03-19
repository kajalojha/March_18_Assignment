package March_18_Assignment;
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Q3_Add_two_num_linkekdlist {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to start the result linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Traverse both linked lists simultaneously
        while (l1 != null || l2 != null) {
            // Get the values of current nodes (if available)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum of current digits and carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Update carry for the next iteration
            int digit = sum % 10; // Get the least significant digit of the sum

            // Create a new node with the digit and append it to the result linked list
            current.next = new ListNode(digit);
            current = current.next;

            // Move to the next nodes in both linked lists (if available)
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's still a carry after traversing both lists, add it as a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next; // Return the head of the result linked list (excluding the dummy node)
    }
    public static void main(String[] args) {
        Q3_Add_two_num_linkekdlist solution = new Q3_Add_two_num_linkekdlist();

        // Example usage:
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
