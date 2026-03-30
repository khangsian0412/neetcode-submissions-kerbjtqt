class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;
        Map<Integer, Integer> count = new HashMap<>(10);
        List<Integer>[] freq = new List[nums.length + 1]; //this gives an array of list
        for(int i = 0; i < length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0; 
        for(int i = freq.length - 1; i > 0 && index < k; i--){ //the first for loop loops through all the lists in the array 
            for(int n : freq[i]){ //this second loop loops through elements within a list (which are those with the same count)
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
