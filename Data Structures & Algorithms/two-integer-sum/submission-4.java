class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSumMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (twoSumMap.containsKey(complement)) {
                /*int firstIndex = twoSumMap.get(complement);
                int secondIndex = i;
                // Ensure the smaller index comes first
                return new int[] { Math.min(firstIndex, secondIndex), Math.max(firstIndex, secondIndex) };*/

                return new int[] {twoSumMap.get(complement), i};
            }
            
            twoSumMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[] {};
    }
}

