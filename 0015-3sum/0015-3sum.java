class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a= new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while (j<k){
                int ans=nums[i]+nums[j]+nums[k];
                if(ans>0){
                    k--;
                }
                else if(ans<0){
                    j++;
                }
                else{
                    a.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return a;
    }
}