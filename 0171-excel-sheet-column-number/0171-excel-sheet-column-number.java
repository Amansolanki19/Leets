class Solution {
    public int titleToNumber(String str) {
        int sum=0,phaseValue=0;
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            int temp=str.charAt(i)-64;
            sum+=Math.pow(26,phaseValue++)*temp;
        }
        return sum;
    }
}