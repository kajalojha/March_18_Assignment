package March_18_Assignment;
import java.util.ArrayList;
public class Q7_Increase_size
{
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Ensure that the ArrayList has at least the capacity for 100 elements
        arrayList.ensureCapacity(100);

        // Add elements to the ArrayList (it will automatically grow as needed)
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());
    }
}
