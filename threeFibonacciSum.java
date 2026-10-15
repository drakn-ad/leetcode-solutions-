class Solution {
    public boolean threeFibonacciSum(int n) {
        long a = 0, b = 1, c = 1;
        while(a+b+c <= n) {
            if(a+b+c == n) return true;
            long temp = b + c;
            a = b;
            b = c;
            c = temp;
        } 
        return false;
    }
}

/*

a, b, c
a =0 , b = 1, c = 1;
get the first 3 nums
so the next is a + b + c sequenced nums
loop(a+b+c<=n)
    if(a+b+c == n) return 1
    temp = b+c
    a = b
    b = c
    c = temp

return 0
 */
class Solution {
    public boolean threeFibonacciSum(int n) {
        long a = 0, b = 1, c = 1;
        while(a+b+c <= n) {
            long temp = b + c;
            a = b;
            b = c;
            c = temp;
        } 
        return a+b+c == n;
    }
}







