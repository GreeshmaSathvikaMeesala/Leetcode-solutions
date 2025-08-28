class Solution {
    public boolean isHappy(int n) {
        Set<Integer> ans=new HashSet<>();
        while(n!=1 && !ans.contains(n)){
            ans.add(n);
            n=getAns(n);
        }
        return n==1;
    }
    public int getAns(int n){
        int total=0;
        while(n>0){
            int digit=n%10;
            total+=digit*digit;
            n/=10;
        }
        return total;
    }
}