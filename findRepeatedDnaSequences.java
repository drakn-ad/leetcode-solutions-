class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
   
        Set<String> seen = new HashSet<>();
        Set<String> adder = new HashSet<>(); 
        for(int r = 0;r<=s.length()-10;r++) {
            String subSet = s.substring(r, r+10);
            if(!seen.add(subSet)) {
                adder.add(subSet);
            }
        }
        return new ArrayList<>(adder);
    }
}
