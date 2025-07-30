class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=0;
        for(int i=0;i<n;i++){
            a=nums[n/2];
        }
        return a;
    }
}