class Solution {
    public int[] countBits(int n) {
        int[] db = new int[n+1];
        int offset = 1;
        for(int i=1;i<=n;i++) {
            if(offset*2 == i) {
                offset = i;
            }
            db[i] = 1 + db[i-offset];
        }
        return db;
    }
}
