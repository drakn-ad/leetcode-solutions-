class Solution {
    public List<String> letterCasePermutation(String s) {
        Queue<String> queue = new LinkedList<>();
        queue.add(s);
        for(int i=0;i<s.length();i++) {
            if(Character.isDigit(s.charAt(i))) continue;
            int size = queue.size();
            for(int j=0;j<size;j++) {
                String curr = queue.poll();
                char[] chars = curr.toCharArray();
                chars[i] = Character.toLowerCase(chars[i]);
                queue.add(new String(chars));
                 chars[i] = Character.toUpperCase(chars[i]);
                queue.add(new String(chars));
            }
            
        }
        return new ArrayList<>(queue);
    }
}
