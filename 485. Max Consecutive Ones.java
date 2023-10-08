class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int n : nums){
            if(n == 0){
                if(max < count){
                    max = count;
                }
                count = 0;
            }else{
                count++;
            }
        }
        if(nums[nums.length-1] == 1){
            if(max < count){
                max = count;
            }
        }
        return max;
    }
}
