class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
     
		String answer = "";
        
        for(int i=0;i<=my_string.length()-1;i++){
            boolean b= false;
            if(i==s){
                answer+=overwrite_string;
                i+=overwrite_string.length();
                if(i>my_string.length()){
                
                    break;
                } 
                b=true;
                i--;
                
            }
            if(!b){
              answer+=my_string.charAt(i);
              
            }
        }
        return answer;
    }
}