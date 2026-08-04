class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> valid=new HashSet<>();
        String ans="";
        for(String word:words){
            if(word.length()==1){
                valid.add(word);

                if(word.length()>ans.length()){
                    ans=word;
                }
                continue;
            }
            String prefix=word.substring(0,word.length()-1);

            if(valid.contains(prefix)){
                valid.add(word);

                if(word.length()>ans.length()){
                    ans=word;
                }
            }
            
        }
        return ans;
    }
}