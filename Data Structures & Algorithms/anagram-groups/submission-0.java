class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
         for(String str:strs){
            int[] freq = new int[26];
            //count freq
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i) - 'a'] ++;
            }
            //reate unique key
            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());

            //add str to group

            map.get(key).add(str);
         }
         return new ArrayList<>(map.values());
    }
}
