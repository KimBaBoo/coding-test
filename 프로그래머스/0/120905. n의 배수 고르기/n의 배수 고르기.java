class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt=0;
        for(int i=0;i<=numlist.length-1;i++){
            if(numlist[i]%n==0){
                cnt++;
            }
        }
        int k=0;
        int[] answer=new int[cnt];
        for(int i=0;i<=numlist.length-1;i++){
            if(numlist[i]%n==0){
                answer[k]=numlist[i];
                k++;
            }
        }
        return answer;
    }
}