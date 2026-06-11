class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] result = new int[size];

        for(int i=0; i<size; i++){
            int count = 0;

            for(int j = i+1; j<size; j++){
                if(temperatures[i] < temperatures[j]){
                    count++;
                    result[i] = count;
                    break;
                }
                count++;
            }

        }
        return result;

    }
}
