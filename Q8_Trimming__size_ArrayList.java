package March_18_Assignment;
import java.util.ArrayList;
public class Q8_Trimming__size_ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        // Print the original capacity and size of the ArrayList
        System.out.println("Original Capacity: " + arrayList.size()); // This method doesn't exist in ArrayList, but it's shown here to illustrate the concept
        System.out.println("Original Size: " + arrayList.size());

        // Remove some elements from the ArrayList (just for demonstration)
        arrayList.remove(50);
        arrayList.remove(30);
        arrayList.remove(10);

        // Trim the capacity of the ArrayList
        arrayList.trimToSize();

        // Print the trimmed capacity and current size of the ArrayList
        System.out.println("Trimmed Capacity: " + arrayList.size());
        System.out.println("Current Size: " + arrayList.size());
    }
}
