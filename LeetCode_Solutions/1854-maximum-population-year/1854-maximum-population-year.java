class Solution {
    public int maximumPopulation(int[][] logs) {
        int answerYear=1950;
        int[] population=new int[101];
        int maxPopulation=Integer.MIN_VALUE;
        for(int[] log:logs){
            for(int year=log[0];year<log[1];year++){
                population[year-1950]++;
            }
        }
        for(int i=0;i<101;i++){
            if(population[i]>maxPopulation){
                 maxPopulation=population[i];
                 answerYear=i+1950;
            }
        }
        return answerYear;
    }
}