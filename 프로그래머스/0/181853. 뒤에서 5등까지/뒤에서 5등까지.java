class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int a = 0;
        for(int i=0;i<=num_list.length-1;i++){
            for(int j=i+1;j<=num_list.length-1;j++){
                if(num_list[i]>num_list[j]){
                    a=num_list[i];
                    num_list[i]=num_list[j];
                    num_list[j]=a;
                }
            }
        }
        for(int i=0;i<=4;i++){
            answer[i]=num_list[i];
        }
        return answer;
    }
}