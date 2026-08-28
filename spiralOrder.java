class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows-1;
        int left =0;
        int right = cols-1;
        List<Integer> res = new ArrayList<>();
        while(top<=bottom&&left<=right) {
            for(int i=left;i<=right;i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++) {
                res.add(matrix[j][right]);
            }
            right--;
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    res.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    res.add(matrix[l][left]);
                }
                left++;
            }
        }
        return res;
    }
}
