class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; ++i){
            for (int j = 0; j < nums.length; ++j){
                if((i != j) && (nums[i] + nums[j] == target)){
                    answer[0] = j; 
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}
