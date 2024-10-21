import java.util.*;

public class Solution {
    public static List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int minValue = Integer.MAX_VALUE;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
            
            if (minValue == Integer.MAX_VALUE) {
                result.add(-1);
            } else {
                result.add(minValue);
            }
        }
        
        return result;
    }
}