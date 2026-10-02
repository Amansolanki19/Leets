class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int a:nums){
            if(max<a){
                secondMax=max;
                max=a;
            }else if(secondMax<a && max>=a){
                secondMax=a;
            }
        }

        return (max-1)*(secondMax-1);
    }
}