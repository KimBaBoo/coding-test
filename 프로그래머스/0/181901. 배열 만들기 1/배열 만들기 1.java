class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int q=0;
        for(int i=0;i<=answer.length-1;i++){
            q+=k;
            answer[i]=q;
        }
        return answer;
    }
}