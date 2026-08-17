class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.fill(res,1);
        int ans=1;

        for(int i=1;i<nums.length;i++){
            for(int left=0;left<i;left++){
                if(nums[left]<nums[i]){
                    if(res[left]+1>res[i]){
                        res[i]=res[left]+1;
                    }
                }
            }
            ans=Math.max(ans,res[i]);
        }
        return ans;
    }
}