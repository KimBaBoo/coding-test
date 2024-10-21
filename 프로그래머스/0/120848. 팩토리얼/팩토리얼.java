class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=1;
        int i=1;
        while(true){
            a*=i;
            if(a>n){
                answer=i-1;
                break;
            }
            i++;
        }
        return answer;
    }
}