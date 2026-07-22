class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            // n % 3 : 현재 3진수의 가장 마지막 자리
            // answer * 3 : 기존 3진수를 한 자리 왼쪽으로 이동 (3진수 이니까 * 3)
            // + n % 3 : 마지막 자리에 새 숫자를 붙임
            answer = answer * 3 + n % 3;
            
            // 다음 자릿수 계산
            n /= 3;
        }
        
        return answer;
    }
}