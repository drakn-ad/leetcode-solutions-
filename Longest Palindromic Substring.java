class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for(int i=0;i<s.length();i++) {
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s,i,i+1);
            int mxLen = Math.max(len1,len2);
            if(mxLen > end - start) {
                start = i-(mxLen-1)/2;
                end = i+ mxLen/2;
            }
        }
        return s.substring(start, end + 1);
    }
    private int expandAroundCenter(String s,int left, int right) {
        while(left >= 0&&right < s.length()&&s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}

//still needto be revised😥
