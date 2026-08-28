class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> noDups = new HashSet<>();
        for(int num : nums) {
            noDups.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=nums.length;i++) {
            if(!noDups.contains(i)) res.add(i);
        }
        return res;
    }
}
