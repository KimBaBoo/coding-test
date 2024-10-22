import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int[] answer = {};
        
        switch(n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b+1);
                break;
            
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
                
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b+1);
                break;
            
            case 4:
                int size = (b - a) / c + 1;
                answer = new int[size];
                int cnt = 0;
                for (int i = a; i <= b; i += c) {
                    answer[cnt] = num_list[i];
                    cnt++;
                }
                break;
        }
        
        return answer;
    }
}