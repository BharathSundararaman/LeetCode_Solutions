class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0,mid=s.length()/2;
        for(int i=0;i<mid;i++){
            char first=s.charAt(i);
            char second=s.charAt(i+mid);

            if(isVowel(first)) count++;

            if(isVowel(second)) count--;

        }
        return count==0;
    }
    private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}