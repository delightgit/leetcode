class Solution {
    public boolean judgeCircle(String moves) {
        int y = 0;
        int x = 0;
        for(int i = 0; i < moves.length(); ++i){
            if(moves.charAt(i) == 'U'){
                y++;
            }
            if(moves.charAt(i) == 'D'){
                y--;
            }
            if(moves.charAt(i) == 'R'){
                x++;
            }
            if(moves.charAt(i) == 'L'){
                x--;
            }
        }
        return y == 0 && x == 0;
    }
}
