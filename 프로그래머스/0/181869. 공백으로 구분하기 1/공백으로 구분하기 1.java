class Solution {
    public String[] solution(String my_string) {
        
        int a=1;
        for(int i=0;i<=my_string.length()-1;i++){
            if(my_string.charAt(i)==' '){
                a++;
            }
        }
        String[] answer = new String[a];
         for(int i=0;i<=answer.length-1;i++) {
	        	answer[i]="";
	        }
        int k=0;
        for(int i=0;i<=my_string.length()-1;i++){
            if(my_string.charAt(i)!=' '){
           answer[k]+=my_string.charAt(i);
            } else{
                k++;
                
            }
        }
        return answer;
    }
}