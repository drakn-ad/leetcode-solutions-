class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> pairs = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++) {
            int curr = arr[i] - arr[i-1];
            if(curr < minDiff) {
                minDiff = curr;
                pairs.clear();
                pairs.add(Arrays.asList(arr[i-1], arr[i]));
            }else if(minDiff == curr) {
                pairs.add(Arrays.asList(arr[i-1], arr[i]));
            }
            
        }
        return pairs;

    }
}
