class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int[] arr=new int[box.length-1];
        for(int i=0;i<=box.length-1;i++){
            answer*=(box[i]/n);
            
        }
        return answer;
    }
}