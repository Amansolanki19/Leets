class Solution {
    public int lengthOfLastWord(String s) {
        String [] arr=s.split(" ");
        int len=arr.length;
        String last_string=arr[len-1];
        return (last_string.length());
    }
}