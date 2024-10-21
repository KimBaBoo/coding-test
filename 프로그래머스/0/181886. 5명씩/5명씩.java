class Solution {
    public String[] solution(String[] names) {
        int cnt = names.length/5;
        if(names.length%5!=0)
            cnt+=1;
        String[] answer = new String[cnt];
        int q = 0;
        for(int i = 0 ; i < names.length ; i+=5){
            answer[q] = names[i];
            q++;
        }
        
        return answer;
    }
}