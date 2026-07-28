class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1,j=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                while(nums[j]<=nums[pivot]){
                    j--;
                }
                swap(nums,pivot,j);
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,nums.length-1);
        }else{
            reverse(nums,pivot+1,nums.length-1);
        }
    }
    private void swap(int[] nums,int pivot,int j){
        int temp=nums[j];
        nums[j]=nums[pivot];
        nums[pivot]=temp;
    }
    private void reverse(int[] nums,int pivot,int j){
        while(pivot<j){
            int temp=nums[j];
            nums[j]=nums[pivot];
            nums[pivot]=temp;
            pivot++;
            j--;
        }
    }
}