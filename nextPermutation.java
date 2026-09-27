class Solution {
    
    public void nextPermutation(int[] nums) {
        int idx = -1;
        //getting the break point
        for(int i=nums.length-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }
        if(idx == -1) {
            int left = 0;
            int right = nums.length-1;
            while(left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }
        //swapping the next smallest num withe the break point num
        for(int i=nums.length-1;i>idx;i--) {
            if(nums[i] > nums[idx]) {
                //swapping process
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        //reverse process
        int left = idx+1;
        int right = nums.length-1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}

/*
⚔️══════ D R A K E N ══════⚔️
I AM THE ALL RANGE      ATOMIC!!!!
*/
