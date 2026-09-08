class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicatePresent = false;

        int i, j;
        int len = nums.length;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    duplicatePresent = true;
                    break;
                }
            }
            if (duplicatePresent) {
                break;
            }
        }
        
        return duplicatePresent;
    }
}