class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        if(total%2!=0) return false;

        int target=total/2;
        int n=nums.length;

        boolean[][] dp=new boolean[n+1][target+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }

        for(int i=n-1;i>=0;i--){
            for(int sum=1;sum<=target;sum++){
                if(nums[i]>sum){
                    dp[i][sum]=dp[i+1][sum];
                }else{
                    dp[i][sum]=dp[i+1][sum] || dp[i+1][sum-nums[i]];
                }
            }
        }
        return dp[0][target];
    }
}