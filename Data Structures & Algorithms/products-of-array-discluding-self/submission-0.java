class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fromLeft = new int[nums.length];
        int[] fromRight = new int[nums.length];
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i < 1){
                fromLeft[i] = 1;
                continue;
            }
            fromLeft[i] = nums[i-1] * fromLeft[i-1];
        }

        for(int j = nums.length - 1; j >= 0; j--){
            if(j > nums.length - 2){
                fromRight[j] = 1;
                continue;
            }
            fromRight[j] = nums[j+1] * fromRight[j+1];
        }
        
        for(int z = 0; z < nums.length; z++){
            result[z] = fromLeft[z] * fromRight[z];
        }
        return result;
    }
}  
