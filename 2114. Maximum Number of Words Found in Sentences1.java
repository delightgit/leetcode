class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String s : sentences){
            int spaceCount = 0;
            for(int i = 0; i < s.length(); ++i) {    
                if(s.charAt(i) == ' '){    
                    ++spaceCount;    
                }
                if(spaceCount > maxCount){
                    maxCount = spaceCount;
                }
            }
        }
        return maxCount+1;
    }
}
