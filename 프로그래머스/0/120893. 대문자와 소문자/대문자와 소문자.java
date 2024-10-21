class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<=my_string.length()-1;i++){
            if(my_string.charAt(i)<=90&&my_string.charAt(i)>=65){
                answer+=""+(char)(my_string.charAt(i)+32)+"";
            }
            else{
                answer+=""+(char)(my_string.charAt(i)-32)+"";
            }
        }
        return answer;
    }
}