class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums){
        map.put(num, map.getOrDefault(num,0) +1);

    }
    //convert  keys into list
    List<Integer> list = new ArrayList<>(map.keySet());

    //sort by frequency
    list.sort((a,b) -> map.get(b) - map.get(a));


    //store top k ele
    int[] res = new int[k];

    for(int i=0;i<k;i++){
        res[i] = list.get(i);
    }                        
    return res;                                                      
}
}