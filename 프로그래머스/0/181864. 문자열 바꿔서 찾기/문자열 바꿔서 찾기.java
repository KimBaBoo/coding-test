class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String s = "";
        for(int i=0;i<=myString.length()-1;i++){
            if(myString.charAt(i)=='A'){
                s+="B";
            } else{
                s+="A";
            }
        }
        if(s.contains(pat))
            answer=1;
        return answer;
    }
}