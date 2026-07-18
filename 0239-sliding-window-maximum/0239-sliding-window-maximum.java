class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] nge = new Solution().nextGreater(nums);

        return new Solution().slidingWindowMaximum(nums, nge, k);

    }

    public int[] nextGreater(int[] arr) {

        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        nge[n - 1] = n;
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty())
                nge[i] = n;
            else
                nge[i] = st.peek();

            st.push(i);
        }

        return nge;
    }

    public int[] slidingWindowMaximum(int[] arr, int[] nge, int k) {

        int[] ans = new int[arr.length - k + 1];
        int j = 0;

        for (int i = 0; i <= arr.length - k; i++) {

            if (j < i)
                j = i;

            while (nge[j] < i + k) {
                j = nge[j];
            }

            ans[i] = arr[j];
        }

        return ans;
    }
}