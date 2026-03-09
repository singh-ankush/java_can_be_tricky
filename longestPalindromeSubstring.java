class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {

        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                String rev = new StringBuilder(sub).reverse().toString();

                if (sub.equals(rev) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("farrat"));
    }
}
