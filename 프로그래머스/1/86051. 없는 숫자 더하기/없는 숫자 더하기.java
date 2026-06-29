class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        // (0~9 총합: 45) - (numbers 총합) = 없는 숫자 총합
        
        for (int n : numbers){
            answer -= n;
        }
        
        return answer;
    }
}