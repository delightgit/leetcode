class Solution {
    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences)
            .mapToInt(s -> {
                int spaceCount = 0;
                for(int i = 0; i < s.length(); ++i) {    
                    if(s.charAt(i) == ' '){    
                        ++spaceCount;    
                    }
                }
                return spaceCount+1;
            })
            .max()
            .getAsInt();
    }
}
