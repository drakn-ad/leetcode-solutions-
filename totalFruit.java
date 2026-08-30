class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int len = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int right = 0;right<fruits.length;right++) {
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            while(mp.size() > 2) {
                mp.put(fruits[l],mp.get(fruits[l])-1);
                if(mp.get(fruits[l]) == 0) {
                    mp.remove(fruits[l]);
                }
                l++;
            }
            len = Math.max(len,right-l+1);
            
        }
        return len;
    }
}
