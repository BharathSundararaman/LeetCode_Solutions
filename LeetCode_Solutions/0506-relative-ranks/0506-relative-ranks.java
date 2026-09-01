class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] arr=new String[score.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> score[b]-score[a]);
        for(int i=0;i<score.length;i++){
            pq.offer(i);
        }
        int place=1;
        while(!pq.isEmpty()){
            int index=pq.poll();
            if(place==1) arr[index]="Gold Medal";
            else if(place==2) arr[index]="Silver Medal";
            else if(place==3) arr[index]="Bronze Medal";
            else arr[index]=String.valueOf(place);

            place++;
        }
        return arr;
    }
}