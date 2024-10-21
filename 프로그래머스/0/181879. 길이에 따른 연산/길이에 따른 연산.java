class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length<=10){
            answer=1;
            for(int i=0;i<=num_list.length-1;i++){
                
                answer*=num_list[i];
            } 
        } else{
                for(int i=0;i<=num_list.length-1;i++){
                    answer+=num_list[i];
                }
            }
        return answer;
    }
}