class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = ""+a;
        String sb = ""+b;
        int rea = Integer.parseInt(sa+sb);
        if(rea>(2*a*b)){
            answer=rea;
        } else{
            answer=2*a*b;
        }
        return answer;
    }
}