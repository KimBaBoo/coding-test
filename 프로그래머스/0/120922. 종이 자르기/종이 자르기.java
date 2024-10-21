class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int MS=M-1;
        
        answer+=(N-1)*M;
        answer+=MS;
        return answer;
    }
}