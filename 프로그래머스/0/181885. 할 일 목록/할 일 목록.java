class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        for(int i = 0 ; i < finished.length ; i++){
            if(!finished[i])
                cnt++;
        }
        String[] answer = new String[cnt];
        int q = 0;
        for(int i = 0 ; i < todo_list.length ; i++){
            if(!finished[i]){
                answer[q]=todo_list[i];
                q++;
            }
        }
        return answer;
    }
}