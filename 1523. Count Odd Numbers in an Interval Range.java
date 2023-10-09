class Solution {
    public int countOdds(int low, int high) {
        return ((high-low) >> 1) + ((high | low) & 1);
        /*
    	case 1 A & B: even
        	(10-6)/2 = 2
            (4)/2 = 2
            Answer: [7,9] = 2
    	case 2 A & B: odd
            (7-3)/2 = 2
            (4)/2 = 2
            Answer: [3,5,7] = 3
    	case 3 A & B: even & odd
            (8-3)/2 = 2.5
            (5)/2 = 2.5
            Answer: [3,5,7] = 3
    	case 4 A & B: odd & even
            (9-2)/2 = 3.5
            (7)/2 = 3.5
            Answer: [3,5,7,9] = 4
        if A & B are even,
            (A - B) / 2 = Answer
        if either A or B is odd,
            (A - B) / 2 + 1 = Answer
            odd or odd = odd
            odd or even = odd
            even or even = even
    	*/
    }
}
