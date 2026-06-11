class Solution {

    public String encode(List<String> strs) {
        // we iterate over a list of Strings and keep appending it to a string with a length 
        // and a special char #
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            int length = s.length();
            sb.append(length);
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
            // here we take above formed string and keepinf adding it to a list whenever we encounter
            // a space
        if(str.isEmpty()){
            return new ArrayList();
        }
        List<String> list = new ArrayList<>();

        int i = 0;
        while ( i < str.length()) {

            // Find the delimiter '#'
            int hashIndex = str.indexOf('#', i);

            // Extract length
            int length = Integer.parseInt(str.substring(i, hashIndex));

            // Extract string
            String word = str.substring(hashIndex + 1,
                                        hashIndex + 1 + length);

            list.add(word);

            // Move to next encoded string
            i = hashIndex + 1 + length;
        }

        return list;        
    }
}
