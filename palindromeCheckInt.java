public class palindromeCheckInt {

    // Method to check if an integer x is a palindrome
    public boolean isPalindrome(int x) {

        // Negative numbers are never palindromes
        if (x < 0) {
            return false;
        }

        // Single-digit numbers (0-9) are always palindromes
        if (x < 10) {
            return true;
        }

        // Make a copy of x to reverse it
        int n = x;

        // Variable to store the reversed number
        int revX = 0;

        // Reverse the number
        while (n > 0) {
            // Take the last digit of n and append it to revX
            revX = 10 * revX + n % 10;

            // Remove the last digit from n
            n /= 10;
        }

        // Compare the reversed number with the original
        if (revX == x) {
            return true; // It's a palindrome
        } else {
            return false; // Not a palindrome
        }
    }
}
