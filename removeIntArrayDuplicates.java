import java.util.HashSet;

public class removeIntArrayDuplicates {
    public static void main(String[] args) {

        // Input array with duplicate elements
        int[] no = {1, 3, 3, 3, 5, 5, 6, 7, 8};

        // Create a HashSet to store unique integers
        // HashSet automatically ignores duplicates
        HashSet<Integer> intg = new HashSet<Integer>();

        // Loop through each element in the array
        for (int i : no) {
            // Add each element to the HashSet
            // If the element already exists, it will not be added again
            intg.add(i);
        }

        // Print the HashSet containing unique elements
        // Note: HashSet does not maintain order
        System.out.println(intg);
    }
}
