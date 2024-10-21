class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int q = my_string.length()-n;
        for(int i=q;i<=my_string.length()-1;i++){
            answer+=my_string.charAt(i);
        }
        return answer;
    }
}