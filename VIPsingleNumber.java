class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums) {
            xor^=num;
        }
        return xor;
    }
}
/*
XOR مع الارقام المتشابهة بصفر 
لو مختلف ب 1

4 ^ 1 ^ 2 ^ 1 ^ 2

بسبب إن XOR ترتيبُه مش مهم، نقدر نرتبهم:

4 ^ 1 ^ 1 ^ 2 ^ 2

نجمّع المتشابه:

4 ^ (1 ^ 1) ^ (2 ^ 2)

وإحنا عارفين:

1 ^ 1 = 0
2 ^ 2 = 0

فتصبح:

4 ^ 0 ^ 0

وبما إن:

4 ^ 0 = 4

فالنتيجة:

4

وده بالضبط الـ Single Number
*/
