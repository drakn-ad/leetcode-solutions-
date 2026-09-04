class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0 ){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int c : coins) {
            if(amount - c >= 0) {
                int res = coinChange(coins, amount-c);
                if(res != -1) {
                    min = Math.min(min, res+1);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
// TLE XXXXXXXXXX
