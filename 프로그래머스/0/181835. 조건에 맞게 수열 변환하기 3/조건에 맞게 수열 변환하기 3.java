class Solution {
    public int[] solution(int[] arr, int k) {
        boolean b=false;
        int[] answer = new int[arr.length];
        if(k%2==0){
            b=true;
        }
      for(int i=0;i<=answer.length-1;i++){
          if(b){
              answer[i]=arr[i]+k;
          } else{
              answer[i]=arr[i]*k;
          }
      }
        return answer;
    }
}