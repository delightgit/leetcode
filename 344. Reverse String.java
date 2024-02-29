class Solution {
    public void reverseString(char[] s) {
        char temp = s[0];
        for(int i = 0, j = s.length-1; i < s.length/2; ++i, --j){
            switchChar(temp, i, j, s);
        }
    }
    public void switchChar(char temp, int start, int end, char[] s){
        temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
}
