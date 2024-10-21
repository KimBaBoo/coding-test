class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0 ; i < myString.length() ; i++){
            if(myString.charAt(i)=='a'||myString.charAt(i)=='A'){
                answer+="A";
            } else if(myString.charAt(i)<='Z'&&myString.charAt(i)>'A'&&myString.charAt(i)!='A'){
                answer+=""+(char)(myString.charAt(i)+32);
            } else if(myString.charAt(i)<='z'&&myString.charAt(i)>'a'&&myString.charAt(i)!='A'){
                answer+=""+myString.charAt(i);
            } else if(myString.charAt(i)==' '){
                answer+=" ";
            }
        }
        return answer;
    }
}