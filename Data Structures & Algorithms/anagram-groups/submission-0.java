class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        1. convert to charArray
        2. sort the array
        3. put array in map if not present. if tht array is already present add it to the list
        4. loop through map's valueSet() and add list to list of strings 
        5. return it.
        */

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chrArr = str.toCharArray();
            Arrays.sort(chrArr);
            String sortedStr = new String(chrArr);

            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(str);
            }else{
                List list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }

        return new ArrayList<>(map.values());



    }
}
