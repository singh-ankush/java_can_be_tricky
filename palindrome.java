class palindrome {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindromes
        // Numbers ending with 0 (except 0 itself) are also not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // This will store the reversed second half of the number
        int reversedHalf = 0;

        // Reverse only half of the digits
        while (x > reversedHalf) {

            // Take the last digit of x and add it to reversedHalf
            reversedHalf = reversedHalf * 10 + x % 10;

            // Remove the last digit from x
            x /= 10;
        }

        // For even digit count: x == reversedHalf
        // For odd digit count: x == reversedHalf / 10 (middle digit ignored)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
