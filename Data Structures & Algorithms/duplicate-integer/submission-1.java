class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicatePresent = false;

        // int i, j;
        // int len = nums.length;
        // for (i = 0; i < len; i++) {
        //     for (j = i + 1; j < len; j++) {
        //         if (nums[i] == nums[j]) {
        //             duplicatePresent = true;
        //             break;
        //         }
        //     }
        //     if (duplicatePresent) {
        //         break;
        //     }
        // }

        Map<Integer, Integer> duplicatesMap = new HashMap();
        
        int i;
        int len = nums.length;
        int count = 1;
        for (i = 0; i < len; i++) {
            if (duplicatesMap.containsKey(nums[i])) {
                duplicatePresent = true;
                break;
            } else {
                duplicatesMap.put(nums[i], 1);
            }
        }
        
        return duplicatePresent;
    }
}