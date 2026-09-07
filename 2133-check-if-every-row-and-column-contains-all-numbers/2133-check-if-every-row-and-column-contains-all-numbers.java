class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> rset=new HashSet<>();
            HashSet<Integer> cset=new HashSet<>();

            for(int j=0;j<n;j++){
                if(matrix[i][j]<1 || matrix[i][j]>n || !rset.add(matrix[i][j])){
                    return false;
                }

                if(matrix[j][i]<1 || matrix[j][i]>n || !cset.add(matrix[j][i])){
                    return false;
                }
            }
        }
        return true;
    }
}