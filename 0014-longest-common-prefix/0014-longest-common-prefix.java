class Solution {
    public String longestCommonPrefix(String[] strs) {

        String result=strs[0];

        for(int i=1;i<strs.length;i++){
            result=commonPrefix(result,strs[i]);
        }

        return result;
        
    }

    public String commonPrefix(String s1,String s2){
        StringBuilder sb = new StringBuilder();

        int index=Math.min(s1.length(),s2.length());

        for(int i=0;i<index;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}