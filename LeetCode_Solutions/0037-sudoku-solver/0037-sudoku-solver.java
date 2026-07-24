class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }
    private boolean backtrack(char[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col]=='.'){
                    for(char digit='1';digit<='9';digit++){
                        if(isValid(board,row,col,digit)){
                            board[row][col]=digit;
                            if(backtrack(board)) return true;
                            board[row][col]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board,int row,int col,char digit){
        for(int c=0;c<board[0].length;c++){
            if(board[row][c]==digit){
                return false;
            }
        }
        for(int r=0;r<board.length;r++){
            if(board[r][col]==digit){
                return false;
            }
        }
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int r=startRow;r<startRow+3;r++){
            for(int c=startCol;c<startCol+3;c++){
                if(board[r][c]==digit){
                    return false;
                }
            }
        }
        return true;
    }
}