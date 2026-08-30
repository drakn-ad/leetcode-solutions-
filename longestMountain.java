class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length-1;
        int mxLen = 0;
        int i=1;
        while(i<n){
            boolean isPeek=arr[i-1]<arr[i]&&arr[i]>arr[i+1];
            if(isPeek){
                int l=i-1;
                while(l>0&&arr[l-1]<arr[l]){
                   l--;
                }
                int r=i+1;
                while(r<n&&arr[r+1]<arr[r]){
                    r++;
                }
                int len = r-l+1;
                mxLen=Math.max(mxLen,len);
                i=r;
            }else{
                i++;
            }
        }
        return mxLen;
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
//this is a python code for make it simple and remember the idea once you see it:
/*
def longestMountain(arr: list[int]) -> int:
    n = len(arr)
    max_length = 0
    i = 1

    while i < n - 1:
        # Check if index i is a peak
        is_peak = arr[i - 1] < arr[i] > arr[i + 1]

        if is_peak:
            left = i - 1
            # Expand to the left boundary
            while left > 0 and arr[left - 1] < arr[left]:
                left -= 1

            right = i + 1
            # Expand to the right boundary
            while right < n - 1 and arr[right] > arr[right + 1]:
                right += 1

            # Update maximum length found
            current_length = right - left + 1
            max_length = max(max_length, current_length)

            # Fast forward i to the end of the current mountain
            i = right
        else:
            i += 1

    return max_length
*/
