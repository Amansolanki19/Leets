class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length,index=0;
        int arr[]=new int[n+n];
        for(int i=0;i<n;i++)
        arr[index++]=nums[i];
        for(int i=0;i<n;i++)
        arr[index++]=nums[i];
        return arr;
    }
}