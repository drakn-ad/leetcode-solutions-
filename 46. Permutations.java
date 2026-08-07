class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solve(nums, new ArrayList<>());
        return res;
    }
    private void solve(int[] nums, List<Integer> curr){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int num : nums){
            if(curr.contains(num)) continue;
            curr.add(num);
            solve(nums,curr);
            curr.remove(curr.size()-1);
        }
    }
}
/*
██████╗ ██████╗  █████╗ ██╗  ██╗███████╗███╗   ██╗
██╔══██╗██╔══██╗██╔══██╗██║ ██╔╝██╔════╝████╗  ██║
██║  ██║██████╔╝███████║█████╔╝ █████╗  ██╔██╗ ██║
██║  ██║██╔══██╗██╔══██║██╔═██╗ ██╔══╝  ██║╚██╗██║
██████╔╝██║  ██║██║  ██║██║  ██╗███████╗██║ ╚████║
╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═══╝
*/
