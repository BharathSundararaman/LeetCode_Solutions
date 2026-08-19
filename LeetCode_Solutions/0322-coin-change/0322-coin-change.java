class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<=0) return 0;
        int[][] dp=new int[coins.length][amount+1];

        for(int i=0;i<coins.length;i++){
            dp[i][0]=0;
        }

        for(int k=1;k<=amount;k++){
            if(k%coins[0]==0){
                dp[0][k]=k/coins[0];
            }else{
                dp[0][k]=-1;
            }
        }

        for(int i=1;i<coins.length;i++){
            for(int k=1;k<=amount;k++){
                if(k<coins[i]){
                    dp[i][k]=dp[i-1][k];
                }else{
                    if(dp[i-1][k]!=-1 && dp[i][k-coins[i]]!=-1){
                        dp[i][k]=Math.min(dp[i-1][k],1+dp[i][k-coins[i]]);
                    }else if(dp[i-1][k]==-1 && dp[i][k-coins[i]]!=-1){
                        dp[i][k]=1+dp[i][k-coins[i]];
                    }else if(dp[i-1][k]!=-1 && dp[i][k-coins[i]]==-1){
                        dp[i][k]=dp[i-1][k];
                    }else{
                        dp[i][k]=-1;
                    }
                }
            }
        }
        
        return dp[coins.length-1][amount];
    }
}