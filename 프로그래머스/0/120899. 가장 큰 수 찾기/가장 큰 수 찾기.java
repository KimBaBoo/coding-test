class Solution {
    public int[] solution(int[] array) {
        int a = 0;
        int max=0;
        
        for(int i=0;i<=array.length-1;i++){
            if(max<array[i]){
                max=array[i];
                a=i;
            }
        }
         int[] answer = {max,a};
        return answer;
    }
}