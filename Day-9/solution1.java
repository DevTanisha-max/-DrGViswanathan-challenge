class Solution {
    public int findNthDigit(int n) {
        // Step 1: Find the length of the number where nth digit belongs
        long len = 1;  // 1-digit, 2-digit, 3-digit, etc.
        long count = 9; // 9 numbers for 1-digit, 90 for 2-digit, etc.
        long start = 1; // 1, 10, 100, etc.
        
        // Find the range where n falls
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }
        
        // Step 2: Find the actual number
        long number = start + (n - 1) / len;
        
        // Step 3: Find the digit in that number
        String numStr = Long.toString(number);
        int digitIndex = (int)((n - 1) % len);
        
        return numStr.charAt(digitIndex) - '0';
    }
}