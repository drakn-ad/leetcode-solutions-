class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        int l = 0;
        for(int r = 0;r<nums.length;r++) {
            if(r-l>k) {
                s.remove(nums[l]);
                l++;
            }
            if(s.contains(nums[r])) {
                return true;
            }
             s.add(nums[r]);
        }
        return false;
    }
}
//////////////////////////////////////////////////
//MAP SOLUTION
/*
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            if(mp.containsKey(num)&&(i-mp.get(num)) <=k) {
                return true;
            }
            mp.put(num,i);
        }
        return false;

*/
