class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n  =nums.length;
        int[] ind = new int[2];
        for(int i =0;i<n-1;i++){
                int j = i+1;
                while(j<=n-1){
                    if(nums[i]+nums[j] == target){
                        ind[0] = i;
                        ind[1] = j;
                        return ind;
                    }
                    j++;
                }
        }
        return ind;
    }
}
