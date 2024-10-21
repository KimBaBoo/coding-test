class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int h = 0;
        int j = 0;
        for(int i = 0 ; i < num_list.length ; i++){
            if(i%2==0){
                j+=num_list[i];
            } else{
                h+=num_list[i];
                
            }
            
            
        }
        if(h>j){
            answer=h;
        }else {
            answer = j;
        }
        return answer;
    }
}