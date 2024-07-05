public class Solution {
    public int solution(String name) {
        int answer = 0;
        int n = name.length();
        
        // 각 문자의 최소 조작 횟수를 더함
        for (int i = 0; i < n; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }

        // 좌우 이동 횟수를 계산
        int move = n - 1; // 기본 이동 횟수: 직선으로 끝까지 이동
        for (int i = 0; i < n; i++) {
            int next = i + 1;
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            move = Math.min(move, i + n - next + Math.min(i, n - next));
        }

        answer += move;
        return answer;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("JEROEN")); // 56
        System.out.println(sol.solution("JAN"));    // 23
    }
}
