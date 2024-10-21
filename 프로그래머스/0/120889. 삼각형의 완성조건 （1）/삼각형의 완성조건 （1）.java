class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int min = sides[0];
        int sec = sides[0];
        for(int i=0;i<=sides.length-1;i++){
            if(max<=sides[i]){
                max=sides[i];
            }
            if(min>=sides[i]){
                min=sides[i];
            }
        }
        for(int i=0;i<=sides.length-1;i++){
            if(sides[i]>min&&sides[i]<max){
                sec=sides[i];
            }
        }
        if(max>=min+sec){
            answer=2;
        }
        else{
            answer=1;
        }
        return answer;
    }
}