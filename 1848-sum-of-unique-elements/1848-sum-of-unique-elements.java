class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        Set<Integer> dup=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!s.add(nums[i])){
                dup.add(nums[i]);
            }
        }
        int sum=0;
        for(int i:s){
            if(!dup.contains(i)){
                sum+=i;
            }
        }
        return sum;
    }
}