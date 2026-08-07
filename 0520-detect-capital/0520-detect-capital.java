class Solution {
    public boolean detectCapitalUse(String word) {

        int upperCaseCount=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i)))   upperCaseCount++;
        }

        boolean isFirstCapital=Character.isUpperCase(word.charAt(0));

        if(upperCaseCount==0 || 
            (upperCaseCount==1 && isFirstCapital)||
            upperCaseCount==word.length())  return true;

        return false;
        
    }
}