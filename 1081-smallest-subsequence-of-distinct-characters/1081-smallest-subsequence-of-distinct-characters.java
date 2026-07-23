class Solution {
    public String smallestSubsequence(String s) {

        int[] count = new int[26];
        boolean[] visited = new boolean[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            int index = c - 'a';
            count[index]--;

            if (visited[index]) {
                continue;
            }

            while (!st.isEmpty()
                    && st.peek() > c
                    && count[st.peek() - 'a'] > 0) {

                char removed = st.pop();
                visited[removed - 'a'] = false;
            }

            st.push(c);
            visited[index] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
    }
}