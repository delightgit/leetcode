class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n/2; i++){ // optimized
            if(n % i == 0){
                list.add(i);
            }
        }
        list.add(n); // add itself to the list
        return list.size() < k ? -1 : list.get(k-1);
    }
}
