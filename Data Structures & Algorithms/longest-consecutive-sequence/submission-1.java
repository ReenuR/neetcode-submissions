class Solution {
    public int longestConsecutive(int[] nums) {
        //first find the starting point which is num whisch doesnt have x-1 present in array
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            int len = 0;
           if(!set.contains(nums[i]-1)){
            int increment = 1;
                len++;
                int next = nums[i] + increment++;
                while(set.contains(next)){
                    len++;
                    next = nums[i]+increment++;
                }
           }
           maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }
}
