class Solution {
    public boolean isGood(int[] nums) {

        int max = 0;

        // Find maximum
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // Length must be max + 1
        if (nums.length != max + 1) {
            return false;
        }

        // Frequency array
        int[] freq = new int[max + 1];

        for (int num : nums) {
            freq[num]++;
        }

        // 1 to max-1 must occur exactly once
        for (int i = 1; i < max; i++) {
            if (freq[i] != 1) {
                return false;
            }
        }

        // Maximum must occur exactly twice
        return freq[max] == 2;
    }
}