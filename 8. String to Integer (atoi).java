class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        long res = 0;
        int i = 0;
        while(i<s.length()&&s.charAt(i)== ' '){
            i++;
        }
        if(i<s.length() && (s.charAt(i) == '-'||s.charAt(i)== '+')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
            if(i < s.length() &&(s.charAt(i) == '+' ||s.charAt(i) == '-')){
                return 0;
            }
        }
        while(i<s.length()&& Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
             if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } 
            else if (sign == -1 && res > (long) Integer.MAX_VALUE + 1) {
                return Integer.MIN_VALUE;
            }
            i++;  
        }
        return (int)(res*sign);
    }
}
/*
⚔️══════ D R A K E N ══════⚔️
*/


