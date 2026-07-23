class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(n,0,board,result);
        return result;
    }
    private void backtrack(int n,int row,char[][] board,List<List<String>> result){
        if(row==n){
            List<String> current=new ArrayList<>();
            for(char[] r:board){
                current.add(new String(r));
            }
            result.add(current);
            return;
        }

        for(int col=0;col<n;col++){
            if(!isSafe(board,row,col,n)){
                continue;
            }

            board[row][col]='Q';
            backtrack(n,row+1,board,result);
            board[row][col]='.';
        }
    }
    private boolean isSafe(char[][] board,int row,int col,int n){
            for(int r=row-1;r>=0;r--){
                if(board[r][col]=='Q'){
                    return false;
                }
            }

            for(int r=row-1,c=col-1;r>=0 && c>=0;r--,c--){
                if(board[r][c]=='Q'){
                    return false;
                }
            }

            for(int r=row-1,c=col+1;r>=0 && c<n;r--,c++){
                if(board[r][c]=='Q'){
                    return false;
                }
            }
            return true;
    }
}

