class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        int[] f=new int[26];
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
            f[t.charAt(i)-'a']--;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]!=0){
                return false;
            }
        }
        return true;
    }
}