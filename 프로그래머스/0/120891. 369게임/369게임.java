class Solution {
    public int solution(int order) {
        int answer = 0;
        while(true){
            if((order%(10))==3||(order%(10))==6||(order%(10))==9){
                answer++;
            }
              order/=10;
            if(order<1){
                break;
            }
        }
        return answer;
    }
}