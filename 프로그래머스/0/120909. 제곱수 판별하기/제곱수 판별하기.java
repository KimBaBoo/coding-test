class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n/i==i&&i!=1&&n%i==0){
                answer=1;
                break;
            }
            else{
                answer=2;
            }
        }
        return answer;
    }
}