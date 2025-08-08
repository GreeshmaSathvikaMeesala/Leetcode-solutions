class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int ans=0;
        Set<Character> str=new HashSet<>();
        while(j<n){
            if(!str.contains(s.charAt(j))){
                str.add(s.charAt(j++));
                ans=Math.max(ans,str.size());
            }
            else{
                str.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}