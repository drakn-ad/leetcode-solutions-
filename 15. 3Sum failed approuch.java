class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> theBom = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplet);
                        if(!theBom.contains(triplet)){theBom.add(triplet);}
                    }
                }
            }
        }
        return theBom;
    }
}
//this brute force solution gives TLE    XXXXX
