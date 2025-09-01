class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int j=i;
                while(nums[j]==0 && j+1<n){
                    j++;
                }
                nums[i]=nums[j];
                nums[j]=0;
            }
        }
    }
}