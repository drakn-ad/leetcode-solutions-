class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> theBom = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int l =i+1,r = nums.length-1;
            int sum = 0;
            while(l<r){
                sum = nums[l]+nums[r]+nums[i];
                if(sum>0) r--;
                else if(sum<0) l++;
                else { 
                    List<Integer> triplet = Arrays.asList(nums[l],nums[r],nums[i]);
                    //Collections.sort(triplet);
                        if(!theBom.contains(triplet)){theBom.add(triplet);}
                        l++;
                        r--;
                }
            }
        }
        return theBom;
    }
    //TLE

    
}

TLE
