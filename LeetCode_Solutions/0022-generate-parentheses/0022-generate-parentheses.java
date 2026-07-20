class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder current=new StringBuilder();
        backtrack(n,0,0,current,res);
        return res;
    }

    private void backtrack(int n,int open,int close,StringBuilder current,List<String> res){
        if(current.length()==2*n){
            res.add(current.toString());
            return;
        }

        if(open<n){
            current.append('(');
            backtrack(n,open+1,close,current,res);
            current.deleteCharAt(current.length()-1);
        }

        if(close<open){
            current.append(')');
            backtrack(n,open,close+1,current,res);
            current.deleteCharAt(current.length()-1);
        }
    }
}