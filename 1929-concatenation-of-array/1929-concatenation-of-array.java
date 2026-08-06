class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] newArray = new int[nums.length * 2];
        int n=nums.length;

        for(int i=0;i<nums.length;i++){
            newArray[i]=nums[i];
            newArray[n+i]=newArray[i];
        }

        return newArray;
        
    }
}