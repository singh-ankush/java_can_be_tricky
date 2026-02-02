class Main {

    // Method to find the length of the last word in a string
    public int LengthofLastWord(String s) {
        
        // Initialize count of characters in the last word
        int count = 0;
        
        // Get the length of the input string
        int len = s.length();
        
        // Start from the last character of the string
        int i = len - 1;
        
        // Edge case: if the string is null or empty, return 0
        if(s == null || s.length() == 0){
            return 0;
        }
        
        // Skip any trailing spaces at the end of the string
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        
        // If we have moved past the start, it means the string had only spaces
        if(i == -1){
            return 0;
        }
        
        // Count the characters in the last word
        // Stop counting when we reach a space or the start of the string
        while(i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        
        // Return the length of the last word
        return count;
    }
   
}
