class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean truthy = false;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i != j && nums[i] == nums[j]){
                    truthy = true;
                }
            }
        }
        return truthy;
    }
}