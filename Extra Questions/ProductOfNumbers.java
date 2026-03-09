class Solution {
    public int maximumProduct(int[] nums) {
        int prod=1;
        int n= nums.length;
        for(int i=0;i<n;i++){
            prod*=nums[i];
        }
        return prod;
    }
}
