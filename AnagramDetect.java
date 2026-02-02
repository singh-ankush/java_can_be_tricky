import java.util.Arrays;

public class AnagramDetect {
    public static void main(String[] args) {
        
        // Two strings to compare
        String a1 = "john";
        String a2 = "onjh";

        // Convert the strings into character arrays
        // This allows us to sort the individual characters
        char[] a1p = a1.toCharArray();
        char[] a2p = a2.toCharArray();

        // Sort the character arrays
        // After sorting, both arrays should have characters in the same order if they are anagrams
        Arrays.sort(a1p);
        Arrays.sort(a2p);

        // Compare the sorted arrays
        // Arrays.equals() returns true if both arrays have the same length and same elements in the same order
        if (Arrays.equals(a1p, a2p)) {
            System.out.println("ok");    // Strings are anagrams
        } else {
            System.out.println("not ok"); // Strings are not anagrams
        }
    }
}
