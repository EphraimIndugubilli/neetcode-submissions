class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for(int j = 0;j<n-1;j++){
            int i = n-1;
            while(i>0){
                if(nums[j] == nums[i] && i>j){
                    return true;
                }else{
                    i--;
                }
            } 
        }
        return false;        
    }
}