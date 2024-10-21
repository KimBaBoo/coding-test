class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt=0;
        
        for(int i=0;;){
            cnt++;
            i+=n;
            if(i>num_list.length-1){
                break;
            }
        }
        int[] answer= new int[cnt];
        int a=0;
        for(int i=0;i<=answer.length-1;i++){
            answer[i]=num_list[a];
            a+=n;
        }
        return answer;
    }
}