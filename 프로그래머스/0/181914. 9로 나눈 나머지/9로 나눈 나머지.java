class Solution {
    public int solution(String number) {
        int answer = 0;
        int a = 0;
        for(int i = 0 ; i < number.length() ; i++){
            a+=(int)(number.charAt(i)-48);
        }
        return a%9;
    }
}