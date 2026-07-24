class Solution {
    public String mostCommonWord(String para, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> map = new HashMap<>();

        para=para.toLowerCase().replaceAll("[^a-z]"," ");

        String key="";
        int maxVal=0;

        for(String word : para.split("\\s+")){
            if(bannedSet.contains(word)){
                continue;
            }
            int count=map.getOrDefault(word,0)+1;
            map.put(word,count);

            if(count>maxVal){
                maxVal=count;
                key=word;
            }
        }

        return key;

        
    }
}