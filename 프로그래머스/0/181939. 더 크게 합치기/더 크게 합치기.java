class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sc=""+a+b;
        String sd=""+b+a;
        int rea=Integer.parseInt(sc);
        int reb=Integer.parseInt(sd);
        if(rea>reb){
            answer=rea;
        } else{
            answer = reb;
        }
        
        return answer;
    }
}