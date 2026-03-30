class Solution {
    public int longestConsecutive(int[] nums) {
        //The key insights is that we need to be smart about who we choose to form a sequence 
        Set<Integer> numSet = new HashSet<>();
        for(int numbers : nums){
            numSet.add(numbers);
        }

        int longest = 0;
        for(int numbers : numSet){
            if(!numSet.contains(numbers - 1)){
                int length = 1;
                while(numSet.contains(numbers + length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
