class Solution {
    public int longestConsecutive(int[] nums) {
        //first find the starting point which is num whisch doesnt have x-1 present in array
        
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        int maxLen = 0;
        for(int num:nums){

           if(!set.contains(num-1)){
            int curr = num;
            int len = 1;
           
            while(set.contains(curr + 1)){
                  len++;
                  curr++;
                }
            maxLen = Math.max(maxLen, len);
           }
        
        }

        return maxLen;
    }
}
