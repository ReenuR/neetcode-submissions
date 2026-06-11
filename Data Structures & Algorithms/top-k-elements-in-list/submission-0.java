class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freqArray = new int[k];
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> freqMap.get(b) - freqMap.get(a));


        pq.addAll(freqMap.keySet());

        for(int i =0; i<k; i++){
            freqArray[i] = pq.poll();
        }
        return freqArray;
    }
}
