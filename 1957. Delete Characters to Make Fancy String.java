class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3){
            return s;
        }
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        ans.append(s.charAt(1));
        for(int i = 2; i < s.length(); ++i){
            char c = s.charAt(i);
            if(s.charAt(i-2) != c || s.charAt(i-1) != c){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
