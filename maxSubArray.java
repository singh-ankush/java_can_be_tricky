// Kadane's Algorithm
// This algorithm finds the maximum sum of a contiguous subarray

class Main {

    // Method to find the maximum subarray sum
    public int maxSubArray(int[] nums) {

        // max1 stores the maximum subarray sum found so far
        // Initialize it with the first element of the array
        int max1 = nums[0];

        // cur stores the current subarray sum while iterating
        int cur = 0;

        // Loop through each element in the array
        for (int i : nums) {

            // If current sum becomes negative,
            // reset it to 0 because a negative sum
            // will reduce the sum of any future subarray
            if (cur < 0) {
                cur = 0;
            }

            // Add the current element to the running sum
            cur += i;

            // Update max1 if the current subarray sum
            // is greater than the maximum found so far
            max1 = Math.max(max1, cur);
        }

        // Return the maximum subarray sum
        return max1;
    }
}
