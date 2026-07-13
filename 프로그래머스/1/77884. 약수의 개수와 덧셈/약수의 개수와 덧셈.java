class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            // 제곱근을 구한다.
            int sqrt = (int) Math.sqrt(i);
            
            // 완전제곱수라면
            if ( sqrt * sqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        
        return answer;
    }
}