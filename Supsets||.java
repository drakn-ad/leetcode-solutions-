class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
    private void backtrack(int[] nums, int begin, List<Integer> curr,List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i=begin;i<nums.length;i++){
            if(i > begin && nums[i] == nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
