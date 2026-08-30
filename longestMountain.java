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
