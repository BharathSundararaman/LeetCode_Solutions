class Solution {
    public String reversePrefix(String s, int k) {
        char[] chars=s.toCharArray();
        int left=0,right=k-1;
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        String str=new String(chars);
        return str;
    }
}