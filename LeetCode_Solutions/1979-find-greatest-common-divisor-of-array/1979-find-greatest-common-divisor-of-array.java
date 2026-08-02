class Solution {
    public int findGCD(int[] nums) {
        int maximum=nums[0],minimum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
            }
            if(nums[i]<minimum){
                minimum=nums[i];
            }
        }
        return gcd(minimum,maximum);
    }
    public int gcd(int a,int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
}