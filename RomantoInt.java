class TomantoInt {
    public int romanToInt(String s) {

        // Map each Roman numeral character to its integer value
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        int total = 0;

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {

            // Get the value of the current Roman numeral
            int current = values[s.charAt(i)];

            // If next numeral exists and is larger, subtract current
            if (i + 1 < s.length() && current < values[s.charAt(i + 1)]) {
                total -= current;
            }
            // Otherwise, add current value
            else {
                total += current;
            }
        }

        // Final converted integer value
        return total;
    }
}
