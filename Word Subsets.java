class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2){
        int[] maxFreq = new int[26];
        for(String w : words2){
            int[] c = countFreqs(w);
            for(int i=0;i<26;i++){
                maxFreq[i] = Math.max(maxFreq[i], c[i]);
            }
        }

        List<String> res = new ArrayList<>();
        for(String w : words1){
            int[] c = countFreqs(w);
            if(isUniversal(c,maxFreq)){
                res.add(w);
            }
        }
        return res;
    }
    //count freq
    private int[] countFreqs(String s){
        int[] c = new int[26];
        for(char cc : s.toCharArray()){
            c[cc-'a']++;
        }
        return c;
    }
    //process
    private boolean isUniversal(int[] wc,int[] maxFreq){
        for(int i=0;i<26;i++){
            if(wc[i] < maxFreq[i]) return false;
        }
        return true;
    }
}
