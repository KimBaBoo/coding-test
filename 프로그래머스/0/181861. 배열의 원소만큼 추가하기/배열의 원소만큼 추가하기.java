class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for(int i= 0 ; i < arr.length ; i++){
            cnt+=arr[i];
        }
        int re = 0;
        int[] answer = new int[cnt];
        for(int i=0 ; i < arr.length ; i++){
            for(int j = 0; j < arr[i] ; j++){
                answer[re]=arr[i];
                re++;
                
            }
        }
        return answer;
    }
}