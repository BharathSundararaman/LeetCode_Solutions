class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>current= new ArrayList<>();
        backtrack(candidates,target,0,result,current);
        return result;
    }
    private void backtrack(int[] candidates,int target,int index,List<List<Integer>> result,List<Integer> current){
       if(target==0){
        result.add(new ArrayList<>(current));
        return;
       } 
       if(target<0){
        return;
       }

       for(int i=index;i<candidates.length;i++){
        current.add(candidates[i]);
        backtrack(candidates,target-candidates[i],i,result,current);
        current.remove(current.size()-1);
       }
    }
}