class Solution {
public:
    string toLowerCase(string s) {
        int gap = 'a' - 'A';
        for(int i = 0; i < s.length(); ++i){
            if(s[i] >= 'A' && s[i] <= 'Z'){
                s[i] = char(s[i] + gap);
            }
        }
        return s;
    }
};
