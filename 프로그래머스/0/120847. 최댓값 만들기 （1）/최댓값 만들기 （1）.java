class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a=0;
        for(int i=0;i<=numbers.length-1;i++){
            for(int j=i+1;j<=numbers.length-1;j++){
                if(numbers[i]>numbers[j]){
                    a=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=a;
                }
            }
        }
        answer=numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}