class Solution {
    public int[] solution(int n) {
        int cnt=0;
        int q = n;
        while(true){
            if(q==1)
                break;
            if(q%2==0){
                q=q/2;
            } else{
                q=q*3+1;
            }
            cnt++;
        }
        int[] answer = new int[cnt+1];
        int i = 1;
        answer[0]=n;
        while(true){
            if(n==1)
                break;
            if(n%2==0){
                n=n/2;
                answer[i]=n;
            } else{
                n=n*3+1;
                answer[i]=n;
            }
            
            i++;
        }
        return answer;
    }
}