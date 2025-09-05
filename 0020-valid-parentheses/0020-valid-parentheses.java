class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> sc=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                sc.push(c);
            }
            else{
                if(sc.isEmpty()){
                    return false;
                }
                char top=sc.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='['))
                    return false;

            }
        }
        return sc.isEmpty();
    }
}