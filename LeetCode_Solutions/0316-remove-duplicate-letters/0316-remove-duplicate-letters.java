class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastindex=new int[26];
        for(int i=0;i<s.length();i++){
            lastindex[s.charAt(i)-'a']=i;
        }

        Stack<Character> stack=new Stack<>();
        boolean[] visited=new boolean[26];

        for(int i=0;i<s.length();i++){
            if(visited[s.charAt(i)-'a']) continue;

            while(!stack.isEmpty() && stack.peek() > s.charAt(i) && lastindex[stack.peek() -'a']>i){
                char removed=stack.pop();
                visited[removed-'a']=false;
            }
            stack.push(s.charAt(i));
            visited[s.charAt(i)-'a']=true;
        }

        StringBuilder sb=new StringBuilder();

        for(char ch: stack){
            sb.append(ch);
        }
        
        return sb.toString();

    }
}