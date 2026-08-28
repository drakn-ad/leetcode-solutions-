class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<temp.length;i++) {
            if(!mp.containsKey(temp[i])) mp.put(temp[i],i);
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            res[i] = mp.get(nums[i]);
        }
        return res;

    }
}
