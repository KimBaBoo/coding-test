class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0;i<=my_string.length()-1;i++){
            if(48<=my_string.charAt(i)&&my_string.charAt(i)<=57){
                answer+=my_string.charAt(i)-48;
            }
        }
        return answer;
    }
}